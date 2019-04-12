package com.sye.microservices.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sye.microservices.jwt.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}