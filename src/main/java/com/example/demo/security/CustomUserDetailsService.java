package com.example.demo.security;


import com.example.demo.model.Personal;
import com.example.demo.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    PersonalService personalService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Personal personal=personalService.findByUserName(username);

        User user=null;

        if(personal!=null){
            user=new User(personal.getUserName(), personal.getPassword(), new ArrayList<>());
            return user;
        }

        return null;
    }

}
