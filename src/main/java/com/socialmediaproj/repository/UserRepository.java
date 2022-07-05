package com.socialmediaproj.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.socialmediaproj.entities.User;

public interface UserRepository extends MongoRepository<User,Integer> {

}
