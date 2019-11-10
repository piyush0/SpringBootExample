package com.piyush0.bank.userServer.services;

import com.piyush0.bank.userServer.models.User;
import com.piyush0.bank.userServer.requests.UserRequest;

import java.util.List;

public interface IUserService {

    void createUser (User user);

    List<User> getUsers ();
    
    User getUserById(String id);

    void updateUsersById (User user);

    void deleteUsersById (String id);
}
