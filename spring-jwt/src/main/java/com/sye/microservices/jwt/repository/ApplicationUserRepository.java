package com.sye.microservices.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sye.microservices.jwt.domain.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}