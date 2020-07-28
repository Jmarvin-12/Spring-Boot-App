package com.mrh2020.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrh2020.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
