package com.piyush0.bank.userServer.repositories;

import com.piyush0.bank.userServer.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
