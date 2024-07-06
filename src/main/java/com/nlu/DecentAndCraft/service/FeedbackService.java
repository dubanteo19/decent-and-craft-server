package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.model.Feedback;
import com.nlu.DecentAndCraft.repository.FeedbackRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FeedbackService {
    FeedbackRepository feedbackRepository;

    public Feedback getFeedbackById(Long id) {
        return feedbackRepository.findById(id).orElseThrow(() -> new RuntimeException("Feedback not found"));
    }
    public Feedback saveFeedback(Feedback feedback) {
       return feedbackRepository.save(feedback);
    }
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}
