package com.piyush0.bank.restClientServer.controllers;

import com.piyush0.bank.restClientServer.models.User;
import com.piyush0.bank.restClientServer.requests.UserRequest;
import com.piyush0.bank.restClientServer.services.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "User")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(@Qualifier("userService") UserService userService)
    {
        this.userService = userService;
    }



    @PostMapping(value = "/user")
    @ApiOperation(value = "Add user")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 505, message = "Internal error")
    })
    public ResponseEntity createUser (@ApiParam(value = "Informaciòn necesaria para dar de alta un cliente", required = true) @Valid @RequestBody UserRequest userRequest)
    {
        userService.createUser(userRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "/user")
    @ApiOperation(value = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 505, message = "Internal error")
    })
    public List<User> getUsers ()
    {
        return userService.getUsers();
    }

    @GetMapping(value = "/user/{userId}")
    @ApiOperation(value = "Find user by ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 505, message = "Internal error")
    })
    public User getUserById (@ApiParam(value = "User ID", required = true) @PathVariable("userId") String userId)
    {
        return userService.getUserById(userId);
    }

    @PutMapping(value = "/user/{userId}")
    @ApiOperation(value = "Update user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 505, message = "Internal error")
    })
    public ResponseEntity updateUsersById (@ApiParam(value = "User ID", required = true) @PathVariable("userId") String userId,
                                               @ApiParam(value = "User ID", required = true) @Valid @RequestBody UserRequest userRequest)
    {
        userService.updateUsersById(userId, userRequest);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping (value = "/user/{userId}")
    @ApiOperation(value = "Delete user")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 204, message = "No Content"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 505, message = "Internal error")
    })
    public ResponseEntity deleteUsersById (@ApiParam(value = "User ID", required = true) @PathVariable("userId") String userId)
    {
        userService.deleteUsersById(userId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
