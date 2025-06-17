package com.educandoweb.courseSpring.resources;

import com.educandoweb.courseSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User();
        return ResponseEntity.ok().body(user);
    }
}
