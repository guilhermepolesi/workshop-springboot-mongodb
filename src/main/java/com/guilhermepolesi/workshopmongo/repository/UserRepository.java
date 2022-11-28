package com.guilhermepolesi.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.guilhermepolesi.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
