package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAllByCategoriesId(Long categories_id);
    Optional<Blog> findById(Long blogId);
}
