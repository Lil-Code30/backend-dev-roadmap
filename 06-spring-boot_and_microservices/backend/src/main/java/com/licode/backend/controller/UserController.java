package com.licode.backend.controller;

import com.licode.backend.dto.UserDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/dummy/users")
public class UserController {

    @GetMapping({"/{userId}/posts/{postId}", "/{userId}"})
    public ResponseEntity<String> searchUserPost(@PathVariable Long userId, @PathVariable(required = false) Long postId){

        String response;

        if(postId == null){
            response =   "Fetched user with id: " + userId;
        }else{
            response = "Fetched user with id: " + userId + " and post id: " + postId;
        }

//        ResponseEntity.ok().body(response)
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{userId}/orders/{orderId}")
    public String searchUserOrder(@PathVariable(name = "userId") Long customerId, @PathVariable Long orderId){
        return "Fetched user with id: " + customerId + " and order id: " + orderId;
    }

    @GetMapping("/{userId}/addresses/{addressId}")
    public String searchUserAddress(@PathVariable Map<String, String> pathVariablesMap){

        return "Fetched user with id: " + pathVariablesMap.get("userId") + " and address Id: " + pathVariablesMap.get("addressId");
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam(required = false, defaultValue = "Guest") String name, @RequestParam(name = "gender") String sex){
        return "Fetched the user with query params: " + name + " and gender: " + sex;
    }

    @GetMapping("/headers")
    public String readRequestHeaders(@RequestHeader("User-Agent") String userAgent, @RequestHeader(name = "User-Location", required = false) String userLocation){

        return "Received Headers ->  user agent: " + userAgent + " user location: " + userLocation;
    }

    @GetMapping("/headers/http-headers")
    public String readRequestHeadersWithHttpHeaders(@RequestHeader HttpHeaders requestHeaders){
        return "Received Headers ->  user agent: " + requestHeaders.get("User-Agent") + " user location: " + requestHeaders.get("User-Location");
    }

    @PostMapping
    public String createUser(@RequestBody UserDto userDto){
        return "Created User with the data: " + userDto.toString();
    }

    @PostMapping("/request-entity")
    public ResponseEntity<String> createUserWithRequestEntity(RequestEntity<UserDto> requestEntity){
        HttpHeaders httpHeaders = requestEntity.getHeaders();

        UserDto userDto = requestEntity.getBody();
        String queryParam = requestEntity.getUrl().getQuery();
        String requestPath = requestEntity.getUrl().getPath();

//        return "Created User with the data: " + userDto.toString();

        return ResponseEntity.status(HttpStatus.CREATED).body("Created User with the data: " + userDto.toString());
    }
}
