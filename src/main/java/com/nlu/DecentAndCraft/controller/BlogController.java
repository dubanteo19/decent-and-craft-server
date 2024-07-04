package com.nlu.DecentAndCraft.controller;


import com.nlu.DecentAndCraft.model.Blog;
import com.nlu.DecentAndCraft.service.BlogService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blogs")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BlogController {
    BlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs() {
        return ResponseEntity.ok(blogService.findAll());
    }
    @GetMapping("/search")
    public ResponseEntity<List<Blog>> getAllBlogsByBlogCategoryId(@RequestParam Long categoryId) {
        return ResponseEntity.ok(blogService.findAllBlogByBlogCategoryId(categoryId));
    }

    @GetMapping("/{blogId}")
    public ResponseEntity<Blog> getBlogById(@PathVariable Long blogId) {
        return ResponseEntity.ok(blogService.findById(blogId));
    }
}
