package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.ReviewAddRequest;
import com.nlu.DecentAndCraft.service.ReviewService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReviewLoader implements CommandLineRunner {
    ReviewService reviewService;
    @Override
    public void run(String... args) {
        var r1 = new ReviewAddRequest(1L, 1L, "San pham tuyet voi", 5);
        var r2 = new ReviewAddRequest(2L, 1L, "San pham tam duoc", 3);
        var r3 = new ReviewAddRequest(3L, 1L, "Rat te", 2);
        var r4 = new ReviewAddRequest(4L, 1L, "Xuat sac lam", 5);
        reviewService.saveReview(r1);
        reviewService.saveReview(r2);
        reviewService.saveReview(r3);
        reviewService.saveReview(r4);
    }
}
