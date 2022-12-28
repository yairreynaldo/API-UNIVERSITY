package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Career;

public interface CareerRepository extends JpaRepository<Career, Long> {

}
