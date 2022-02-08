package com.example.hcs.services.impl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.hcs.models.Role;
import com.example.hcs.models.User;
import com.example.hcs.repositories.UserRepository;
import com.example.hcs.services.UserService;
import com.example.hcs.services.constants.MessageConst;
import com.example.hcs.services.constants.UserConst;
import com.example.hcs.services.enums.UserEnum;
import com.example.hcs.services.models.Result;
import com.example.hcs.services.models.role.RoleInfo;
import com.example.hcs.services.models.user.Registration;
import com.example.hcs.services.models.user.UserInfo;


@Service

@PropertySource("classpath:messages.properties")
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private Environment env;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	@Override
	public Result<User> getUserById(UUID uuid) {
		try {
			System.out.println(uuid);
			User user = userRepository.findById(uuid).orElseThrow();
			return new Result<User>(true, env.getProperty(MessageConst.Success.GET_USER_INFO), user);
		} catch (Exception e) {
			return new Result<User>(false, e.getMessage(), null);
		}
	}

	@Override
	public Result<User> registerUser(Registration user) {
		User userDb = null;
		try {
			// Check condition
			if (isUserNameExisted(user.getUserName()))
				return new Result<User>(
						false,
						env.getProperty(MessageConst.USER_EXISTED),
						null);
			Role role = new Role();
			role.setId(user.getRoleId());
			// Random UUID
			UUID uuid = UUID.randomUUID();
			
			// Hash password before save it to DB
			String hashPassword = passwordEncoder.encode(user.getPassword());
			
			// New user which insert to DB
			userDb = new User(
					uuid,
					user.getUserName(),
					user.getFullName(),
					hashPassword,
					user.getPhone(),
					UserEnum.Status.ACTIVATE.toString(),
					0L,
					user.getEmail(),
					null,
					user.getAddress(),
					role,
					UserConst.NOT_LOGIN);
			
			userRepository.save(userDb);
			return new Result<User>(
					true,
					env.getProperty(MessageConst.Success.REGISTER),
					userDb);
		} catch (Exception e) {
			return new Result<User>(false, e.getMessage(), userDb);
		}
	}
	
	private boolean isUserNameExisted(String userName) {
		User user = userRepository.findUserByUserName(userName);
		if (user != null) 
			return true;
		return false;
	}

	@Override
	public Result<List<UserInfo>> getUsers() {
		try {
			// Convert iterator to list
			List<User> users = StreamSupport.stream(
					userRepository.findAll().spliterator(),
					false).collect(Collectors.toList());
			
			// Convert list of user to list of userInfo
			List<UserInfo> userInfos = users.stream().map(user -> new UserInfo(
					user.getId(),
					user.getUserName(),
					user.getFullName(),
					user.getPhone(),
					user.getStatus(),
					user.getLoginFailedCount(),
					user.getEmail(),
					user.getToken(),
					user.getAddress(),
					user.getIsLogin(),
					new RoleInfo(
							user.getRole().getId(),
							user.getRole().getRoleName()
							)
					)).collect(Collectors.toList());
			return new Result<List<UserInfo>>(
					true,
					env.getProperty(MessageConst.Success.GET_ALL_USER),
					userInfos);
		} catch (Exception e) {
			return new Result<List<UserInfo>>(
					true, e.getMessage(), null);
		}
	}

	

}
