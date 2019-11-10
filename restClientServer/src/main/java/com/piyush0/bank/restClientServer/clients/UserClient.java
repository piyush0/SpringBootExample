package com.piyush0.bank.restClientServer.clients;

import com.piyush0.bank.restClientServer.models.User;
import com.piyush0.bank.restClientServer.requests.UserRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient (name= "userService", url = "http://customer-service.eastus.azurecontainer.io:8092", qualifier ="userClient" ) // TODO
public interface UserClient {

    @PostMapping(value = "/user")
    void createUser (@RequestBody UserRequest userRequest);

    @GetMapping(value = "/user")
    List<User> getUsers ();

    @GetMapping(value="/user/{userId}")
    User getUserById(@PathVariable("userId") String userId);

    @PutMapping(value = "/user/{userId}")
    void updateUsersById (@PathVariable("userId") String userId, @RequestBody UserRequest userRequest);

    @DeleteMapping (value = "/user/{userId}")
    void deleteUsersById (@PathVariable("userId") String userId);
}
