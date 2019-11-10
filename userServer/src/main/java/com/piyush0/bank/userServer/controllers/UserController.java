package com.piyush0.bank.userServer.controllers;

import com.piyush0.bank.userServer.models.User;
import com.piyush0.bank.userServer.requests.UserRequest;
import com.piyush0.bank.userServer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(@Qualifier("userService") UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/user")
    public ResponseEntity createUser(@RequestBody UserRequest request) {
        User user = new User(request.getName(),
                request.getApellido(),
                request.getBirthday(),
                request.getGender());
        userService.createUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(value = "/user/{userId}")
    public User getUserById(@PathVariable("userId") String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping(value = "/user/{userId}")
    public ResponseEntity updateUserById(@PathVariable("userId") String userId, @RequestBody UserRequest request) {
        User user = new User(userId, request.getName(),
                request.getApellido(),
                request.getBirthday(),
                request.getGender());
        userService.updateUsersById(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping(value = "/user/{userId}")
    public ResponseEntity deleteUsersById(@PathVariable("userId") String userId) {
        userService.deleteUsersById(userId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
