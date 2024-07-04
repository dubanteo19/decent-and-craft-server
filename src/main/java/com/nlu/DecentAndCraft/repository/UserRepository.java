package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    User findUserByEmailAndPassword(String email, String password);
    Optional<User> findUserByEmail(String email);
}
