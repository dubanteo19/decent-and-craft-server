package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.model.Feedback;
import com.nlu.DecentAndCraft.repository.FeedbackRepository;
import com.nlu.DecentAndCraft.service.FeedbackService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(6)
public class FeedbackLoader implements CommandLineRunner {
    private final FeedbackRepository feedbackRepository;

    @Value("${include-data-loader}")
    boolean includeDataLoader;

    public FeedbackLoader(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (!includeDataLoader) {
            return;
        }
        var f1 = new Feedback(null, 5, "Du Thanh Minh", "", "Facebook", "Tot");
        var f2 = new Feedback(null, 5, "Lieu Thi Diem Quynh", "", "Facebook", "Kha");
        var f3 = new Feedback(null, 4, "Nguyen Thi Chuc Ngan", "", "Zalo", "Xuat sac");
        feedbackRepository.saveAll(List.of(f1, f2, f3));
    }
}
