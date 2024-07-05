package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.CategoryAddRequest;
import com.nlu.DecentAndCraft.model.Image;
import com.nlu.DecentAndCraft.model.ProductBlog;
import com.nlu.DecentAndCraft.model.ProductDetail;
import com.nlu.DecentAndCraft.service.CategoryService;
import com.nlu.DecentAndCraft.service.ProductDetailService;
import com.nlu.DecentAndCraft.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(2)
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PACKAGE)
public class ProductDetailLoader implements CommandLineRunner {
    ProductDetailService productDetailService;
    ProductService productService;
    CategoryService categoryService;
    @Override
    public void run(String... args) {
        loadCategories();
        ProductDetail productDetail1 = new ProductDetail();
        var product = productService.findById(1L);
        var savedProductDetail = productDetailService.save(productDetail1);
        var productBlog1 = new ProductBlog(0L,"San pham tot");
        Image i1 = new Image(0L, "abc.com", savedProductDetail);
        Image i2 = new Image(0L, "abc2.com", savedProductDetail);
        var images = List.of(i1, i2);
        savedProductDetail.setImageList(images);
        savedProductDetail.setProductBlog(productBlog1);
        savedProductDetail.setProduct(product);
        var c1 = categoryService.getCategoryById(1L);
        var c2 = categoryService.getCategoryById(2L);
        savedProductDetail.setCategoryList(List.of(c1,c2));
        productDetailService.save(savedProductDetail);
    }

    private void loadCategories() {
        CategoryAddRequest c1 = new CategoryAddRequest("Gift Sets");
        CategoryAddRequest c2 = new CategoryAddRequest("Album");
        CategoryAddRequest c3 = new CategoryAddRequest("Khung hình");
        CategoryAddRequest c4 = new CategoryAddRequest("Quà tặng");
        CategoryAddRequest c5 = new CategoryAddRequest("Thiệp");
        CategoryAddRequest c6 = new CategoryAddRequest("Nguyên liệu");
        categoryService.saveAllCategory(List.of(c1,c2,c3,c4,c5,c6));
     }
}
