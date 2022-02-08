package com.example.hcs.controllers;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hcs.constants.ApplicationConst;
import com.example.hcs.models.User;
import com.example.hcs.services.UserService;
import com.example.hcs.services.models.Result;
import com.example.hcs.services.models.user.Registration;
import com.example.hcs.services.models.user.UserInfo;

@RestController
@RequestMapping(path = ApplicationConst.BASE_URL + "users")
public class UserController {
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Result<User> getUser(@PathVariable UUID id) {
		Result<User> user = userService.getUserById(id);
		return user;
	}
	
	@GetMapping()
	public @ResponseBody Result<List<UserInfo>> getUsers() {
		return userService.getUsers();
	}
	
	@PostMapping("/signup")
	public @ResponseBody Result<User> registerUser(@RequestBody @Valid Registration user) {
		return userService.registerUser(user);
	}
}
