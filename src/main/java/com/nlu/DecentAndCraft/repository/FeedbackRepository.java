package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}
