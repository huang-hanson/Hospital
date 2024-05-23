package com.hanson.example.demomogo.repository;

/**
 * @author hanson
 * @date 2024/5/23 17:26
 */

import com.hanson.example.demomogo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

