package com.nlu.DecentAndCraft.controller;

import com.nlu.DecentAndCraft.model.Feedback;
import com.nlu.DecentAndCraft.service.FeedbackService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/feedbacks")
public class FeedbackController {
    FeedbackService feedbackService;
    @GetMapping
   public ResponseEntity<List<Feedback>> getAllFeedbacks() {
       return ResponseEntity.ok(feedbackService.getAllFeedback());
   }
}
