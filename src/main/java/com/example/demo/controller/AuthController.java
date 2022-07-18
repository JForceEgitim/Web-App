package com.example.demo.controller;

import com.example.demo.model.dtoModel.AuthRequest;
import com.example.demo.model.dtoModel.DtoLoginRes;
import com.example.demo.security.CustomUserDetailsService;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.PersonalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private PersonalService personalService;
    
    @PostMapping("/login")
    public DtoLoginRes creteToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        } catch (BadCredentialsException ex) {
            throw new Exception("Incorret username or password", ex);
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        DtoLoginRes dtoLoginRes=new DtoLoginRes();
        dtoLoginRes.setJwt(jwt);
       
        
		dtoLoginRes.setRole(personalService.findByUserName(authRequest.getUsername()).getRole());
        return dtoLoginRes;
    }
       
    

    @GetMapping("/key")
    public String hellospringsecurity() {
        return "key";
    }
}
