package com.vitor.course.controller;

import com.vitor.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"Vitor","vitor@email","2422323","2323234");
        return ResponseEntity.ok().body(u); 
    }
}
