package com.piyush0.bank.restClientServer.services;

import com.piyush0.bank.restClientServer.models.User;
import com.piyush0.bank.restClientServer.requests.UserRequest;
import java.util.List;

public interface IUserService {

    void createUser (UserRequest request);

    List<User> getUsers ();

    User getUserById(String userId);

    void updateUsersById (String userId, UserRequest request);

    void deleteUsersById (String id);
}
