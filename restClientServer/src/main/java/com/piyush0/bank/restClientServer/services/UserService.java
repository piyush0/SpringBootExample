package com.piyush0.bank.restClientServer.services;

import com.piyush0.bank.restClientServer.clients.UserClient;
import com.piyush0.bank.restClientServer.models.User;
import com.piyush0.bank.restClientServer.requests.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service ("userService")
public class UserService implements IUserService {


    private UserClient userClient;

    @Autowired
    public UserService(@Qualifier("userClient") UserClient userClient)
    {
        this.userClient = userClient;
    }

    @Override
    public void createUser(UserRequest request) {
        userClient.createUser(request);
    }

    @Override
    public List<User> getUsers() {
        return userClient.getUsers();
    }

    @Override
    public User getUserById(String userId) {
        return userClient.getUserById(userId);
    }

    @Override
    public void updateUsersById(String userId, UserRequest request) {
        userClient.updateUsersById(userId, request);
    }

    @Override
    public void deleteUsersById(String userId) {
        userClient.deleteUsersById(userId);
    }
}
