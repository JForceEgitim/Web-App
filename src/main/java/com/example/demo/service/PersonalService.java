package com.example.demo.service;

import com.example.demo.model.Personal;

public interface PersonalService {
    Personal findByUserName(String userName);
    Personal findByRole(String role);
    void savePersonal(Personal personal);
}
