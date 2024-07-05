package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    boolean existsByUserIdAndProductDetailId(Long user_id, Long productDetail_id);
}
