package com.nlu.DecentAndCraft.controller;

import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {
    ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PutMapping("/{productId}/view")
    public ResponseEntity<Boolean> viewProduct(@PathVariable Long productId) {
        return ResponseEntity.ok(productService.viewProduct(productId));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
        return ResponseEntity.ok(productService.findById(productId));
    }

    @GetMapping("/filter")
    public ResponseEntity<Page<Product>> getProductsByFilter(
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) Integer minRating,
            @RequestParam(required = false) List<Long> categoryIds,
            @RequestParam(required = false) String name,
            @PageableDefault Pageable pageable
    ) {
        var products = productService.getProductsByFilters(minPrice, maxPrice, categoryIds, name, minRating, pageable);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProductsByName(@RequestParam String name) {
        return ResponseEntity.ok(productService.findByName(name));
    }

    @GetMapping("/hot-products")
    public ResponseEntity<List<Product>> getHotProducts() {
        return ResponseEntity.ok(productService.findAllHotProducts());
    }
}
