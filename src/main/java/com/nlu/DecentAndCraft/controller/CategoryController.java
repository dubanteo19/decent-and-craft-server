package com.nlu.DecentAndCraft.controller;

import com.nlu.DecentAndCraft.dto.request.CategoryAddRequest;
import com.nlu.DecentAndCraft.dto.request.CategoryUpdateRequest;
import com.nlu.DecentAndCraft.model.Category;
import com.nlu.DecentAndCraft.service.CategoryService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CategoryController {
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long categoryId) {
        return ResponseEntity.ok(categoryService.getCategoryById(categoryId));
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody CategoryAddRequest category) {
        return ResponseEntity.ok(categoryService.saveCategory(category));
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long categoryId,
                                                   @RequestBody CategoryUpdateRequest request) {
        return ResponseEntity.ok(categoryService.updateCategory(categoryId,request));
    }
}
