package com.example.accessingdatawithmysql.mapper;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatawithmysql.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    
}
