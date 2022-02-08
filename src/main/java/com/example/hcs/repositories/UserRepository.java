package com.example.hcs.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hcs.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, UUID>{
	User findUserByUserName(String userName);
}
