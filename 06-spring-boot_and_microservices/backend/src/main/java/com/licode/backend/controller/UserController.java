package com.licode.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/api/dummy/users/{userId}/posts/{postId}")
    public String searchUserPost(@PathVariable Long userId, @PathVariable Long postId){
        return "Fetched user with id: " + userId + " and post id: " + postId;
    }

    @GetMapping("/api/dummy/users/{userId}/orders/{orderId}")
    public String searchUserOrder(@PathVariable(name = "userId") Long customerId, @PathVariable Long orderId){
        return "Fetched user with id: " + customerId + " and order id: " + orderId;
    }

    @GetMapping("/api/dummy/users/{userId}/addresses/{addressId}")
    public String searchUserAddress(@PathVariable Map<String, String> pathVariablesMap){

        return "Fetched user with id: " + pathVariablesMap.get("userId") + " and address Id: " + pathVariablesMap.get("addressId");
    }
}
