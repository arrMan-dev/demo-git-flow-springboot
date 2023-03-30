package com.arrisdev.demospringbootgitworkflow.controller;

import com.arrisdev.demospringbootgitworkflow.model.User;
import com.arrisdev.demospringbootgitworkflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    private UserService service;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = service.createUser(user);
        return ResponseEntity.ok(newUser);
    }

   @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
       User existingUser = service.allUsers()
               .stream()
               .filter(user -> id == user.getId()).findAny().orElse(null);
      return ResponseEntity.ok(existingUser);
   }
}
