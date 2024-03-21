package com.example.demo.repository;

import com.example.demo.domain.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
}
