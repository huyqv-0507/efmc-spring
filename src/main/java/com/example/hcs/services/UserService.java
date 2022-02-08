package com.example.hcs.services;

import java.util.List;
import java.util.UUID;

import com.example.hcs.models.User;
import com.example.hcs.services.models.Result;
import com.example.hcs.services.models.user.Registration;
import com.example.hcs.services.models.user.UserInfo;

public interface UserService {
	Result<List<UserInfo>> getUsers();
	Result<User> getUserById(UUID uuid);
	Result<User> registerUser(Registration user); 
}
