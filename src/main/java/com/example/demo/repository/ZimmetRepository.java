package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Zimmet;

@Repository
public interface ZimmetRepository extends JpaRepository<Zimmet, Long> {
Zimmet findById(long id);
}