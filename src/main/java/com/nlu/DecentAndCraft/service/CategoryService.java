package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.CategoryAddRequest;
import com.nlu.DecentAndCraft.dto.request.CategoryUpdateRequest;
import com.nlu.DecentAndCraft.model.Category;
import com.nlu.DecentAndCraft.repository.CategoryRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CategoryService {
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow();
    }

    public void saveAllCategory(List<CategoryAddRequest> categoryAddRequests) {
        var categories = categoryAddRequests.stream().map(c -> {
            var category = new Category();
            category.setName(c.categoryName());
            return category;
        }).toList();
        categoryRepository.saveAll(categories);
    }

    public Category saveCategory(CategoryAddRequest categoryAddRequest) {
        var category = new Category();
        category.setName(categoryAddRequest.categoryName());
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long categoryId, CategoryUpdateRequest request) {
        var existingCategory = categoryRepository
                .findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category not found"));
        existingCategory.setName(request.categoryName());
        return categoryRepository.save(existingCategory);
    }
}
