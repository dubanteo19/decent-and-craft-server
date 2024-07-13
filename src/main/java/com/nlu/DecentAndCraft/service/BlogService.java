package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.exception.BlogNotFoundException;
import com.nlu.DecentAndCraft.model.Blog;
import com.nlu.DecentAndCraft.repository.BlogRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BlogService {
    BlogRepository blogRepository;

    public Blog findById(Long blogId) {
        return blogRepository.findById(blogId).orElseThrow(BlogNotFoundException::new);
    }

    public String getBlogContentById(Long blogId) {
        var blog = blogRepository.findById(blogId).orElseThrow(BlogNotFoundException::new);
        return blog.getContent();
    }

    public List<Blog> findAllBlogByBlogCategoryId(Long blogCategoryId) {
        return blogRepository.findAllByCategoriesId(blogCategoryId);
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    public List<Blog> getLimitBlogs(int limit) {
        return blogRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(Blog::getCreatedDate))
                .limit(limit)
                .toList();
    }
}
