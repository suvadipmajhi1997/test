package com.example.testAWS.controller;

import com.example.testAWS.model.User;
import com.example.testAWS.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/save")
    public ResponseEntity<User>saveUser(@RequestBody User user){
        User obj=userService.create(user);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<User>>getAll(){
        List<User>obj=userService.getAllUser();
        return new ResponseEntity<>(obj,HttpStatus.FOUND);
    }

}
