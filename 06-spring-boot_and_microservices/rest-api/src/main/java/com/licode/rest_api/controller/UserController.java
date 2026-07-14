package com.licode.rest_api.controller;

import com.licode.rest_api.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {


    List<User> users = List.of(
            new User(1L, "John Doe", "johnDoe@gmail.com"),
            new User(2L, "Peter", "peter@hotmail.com")
    );

    @GetMapping
    public List<User> getUsers(){
        return users;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        Optional<User> user = users.stream().filter(u -> u.getId().equals(id)).findFirst();

        return user.orElse(null);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User newUser){
        User createdUser = new User(3L, "Loko", "loko@gmail.com");

        users.add(createdUser);

        return createdUser;
    }
}
