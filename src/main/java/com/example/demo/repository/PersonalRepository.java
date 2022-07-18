package com.example.demo.repository;

import com.example.demo.model.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {
    @Query(value="Select * from personal p where p.user_name=?1",nativeQuery = true)
    Personal findByUserName(String userName);
    
    @Query(value="Select * from personal p where p.role=?1",nativeQuery = true)
    Personal findByRole(String role);
    
}

