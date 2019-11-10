package com.piyush0.bank.userServer.services;

import com.piyush0.bank.userServer.models.User;
import com.piyush0.bank.userServer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userService")
public class UserService implements IUserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        Optional<User> userOptional = this.userRepository.findById(id);
        return userOptional.orElse(null);
    }

    @Override
    public void updateUsersById(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void deleteUsersById(String id) {
        this.userRepository.deleteById(id);
    }
}
