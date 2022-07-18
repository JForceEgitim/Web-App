package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Izin;

@Repository
public interface IzinRepository extends JpaRepository<Izin, Long> {
Izin findById(long id);
}