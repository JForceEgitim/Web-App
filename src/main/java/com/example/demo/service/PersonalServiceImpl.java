package com.example.demo.service;

import com.example.demo.model.Personal;
import com.example.demo.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    PersonalRepository personalRepository;

    @Override
    public Personal findByUserName(String userName) {
       return personalRepository.findByUserName(userName);
    }
    @Override
    public Personal findByRole(String role) {
    	return personalRepository.findByRole(role);
    }
    @Override
    public void savePersonal (Personal personal) {
    	personalRepository.save(personal);
    	
    	
    }
    
}
