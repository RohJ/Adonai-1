package com.adonai.dbupdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adonai.dbupdate.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
