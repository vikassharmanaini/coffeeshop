package com.makeindigitaal.coffeeshop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.makeindigitaal.coffeeshop.entity.user;
import com.makeindigitaal.coffeeshop.entity.userRepo;

@Service
public class userservice {
    @Autowired
    userRepo userRepo;
    public ResponseEntity<?> getalluser(){
        return ResponseEntity.ok(userRepo.findAll());
    }
    public ResponseEntity<?> adduser(user user){
        return ResponseEntity.ok(userRepo.save(user));
    }
}