package com.makeindigitaal.coffeeshop.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makeindigitaal.coffeeshop.entity.user;
import com.makeindigitaal.coffeeshop.service.userservice;
@RequestMapping(path = "/api/user")
@RestController
public class userController {
    @Autowired
    user user;
    @Autowired
    userservice userservice;

    @GetMapping(path = "/")
    public ResponseEntity<?> getall() {
        return userservice.getalluser(); 
    }
    @PostMapping(path = "/")
    public ResponseEntity<?> addone(@RequestBody user uasUser){
        uasUser.setId(uasUser.getEmail().hashCode());
        return userservice.adduser(uasUser);
    }
}
