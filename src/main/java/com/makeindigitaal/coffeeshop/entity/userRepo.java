package com.makeindigitaal.coffeeshop.entity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends MongoRepository<user,Integer> {
    
}
