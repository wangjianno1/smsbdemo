package com.soar.smsbdemo.repository;

import com.soar.smsbdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
