package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.ReviewAddRequest;
import com.nlu.DecentAndCraft.service.ReviewService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class ReviewLoader implements CommandLineRunner {
    private final ReviewService reviewService;

    @Value("${include-data-loader}")
    boolean includeDataLoader;
    public ReviewLoader(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @Override
    public void run(String... args) {
        if (!includeDataLoader) {
            return;}
        ReviewAddRequest r1 = new ReviewAddRequest(1L, 1L, "Sản phẩm này thật sự tuyệt vời, tôi yêu nó!", 5);
        ReviewAddRequest r2 = new ReviewAddRequest(2L, 2L, "Chất lượng sản phẩm rất tốt, đáng tiền.", 4);
        ReviewAddRequest r3 = new ReviewAddRequest(3L, 2L, "Sản phẩm này không tệ, nhưng cũng không đặc sắc lắm.", 3);
        ReviewAddRequest r4 = new ReviewAddRequest(4L, 2L, "Sản phẩm này ổn định, không có gì đặc biệt.", 3);
        ReviewAddRequest r5 = new ReviewAddRequest(5L, 2L, "Không có gì đặc sắc, chỉ bình thường thôi.", 2);
        ReviewAddRequest r6 = new ReviewAddRequest(6L, 4L, "Sản phẩm này thật tệ, không bao giờ dùng lại.", 1);
        ReviewAddRequest r7 = new ReviewAddRequest(7L, 4L, "Sản phẩm này làm tôi thất vọng.", 2);
        ReviewAddRequest r8 = new ReviewAddRequest(8L, 4L, "Sản phẩm này không đáp ứng được nhu cầu của tôi.", 2);
        ReviewAddRequest r9 = new ReviewAddRequest(9L, 1L, "Chất lượng sản phẩm không tương xứng với giá tiền.", 3);
        ReviewAddRequest r10 = new ReviewAddRequest(10L, 1L, "Sản phẩm này cũng được, nhưng không đặc sắc lắm.", 3);
        ReviewAddRequest r11 = new ReviewAddRequest(11L, 1L, "Tôi có cảm giác bình thường về sản phẩm này.", 2);
        ReviewAddRequest r12 = new ReviewAddRequest(12L, 2L, "Sản phẩm không tệ, nhưng cũng chẳng có gì đặc biệt.", 3);
        ReviewAddRequest r13 = new ReviewAddRequest(13L, 2L, "Không thể chấp nhận được với chất lượng của sản phẩm này.", 1);
        ReviewAddRequest r14 = new ReviewAddRequest(14L, 2L, "Sản phẩm rất tệ, mình không bao giờ dùng lại.", 1);
        ReviewAddRequest r15 = new ReviewAddRequest(15L, 5L, "Sản phẩm này đã làm tôi hài lòng, tuy nhiên vẫn còn thiếu.", 4);
        ReviewAddRequest r16 = new ReviewAddRequest(16L, 5L, "Sản phẩm này không phải là tuyệt vời, nhưng tôi vẫn thích nó.", 4);
        ReviewAddRequest r17 = new ReviewAddRequest(17L, 5L, "Sản phẩm này không quá tệ, nhưng cũng không quá tốt.", 3);
        ReviewAddRequest r18 = new ReviewAddRequest(18L, 7L, "Chất lượng sản phẩm tương đối tốt, phù hợp với giá tiền.", 4);
        ReviewAddRequest r19 = new ReviewAddRequest(19L, 7L, "Sản phẩm này rất bình thường, không có gì đặc sắc.", 2);
        ReviewAddRequest r20 = new ReviewAddRequest(20L, 7L, "Sản phẩm này cũng ổn, nhưng có thể cải thiện thêm nữa.", 3);
        // Add các đánh giá vào service
        reviewService.saveReview(r1);
        reviewService.saveReview(r2);
        reviewService.saveReview(r3);
        reviewService.saveReview(r4);
        reviewService.saveReview(r5);
        reviewService.saveReview(r6);
        reviewService.saveReview(r7);
        reviewService.saveReview(r8);
        reviewService.saveReview(r9);
        reviewService.saveReview(r10);
        reviewService.saveReview(r11);
        reviewService.saveReview(r12);
        reviewService.saveReview(r13);
        reviewService.saveReview(r14);
        reviewService.saveReview(r15);
        reviewService.saveReview(r16);
        reviewService.saveReview(r17);
        reviewService.saveReview(r18);
        reviewService.saveReview(r19);
        reviewService.saveReview(r20);


    }
}
