package com.example.hcs.services.models.user;

import java.util.UUID;

import com.example.hcs.services.models.role.RoleInfo;

public class UserInfo {
	private UUID id;
	private String userName;
	private String fullName;
	private String phone;
	private String status;
	private Long loginFailedCount;
	private String email;
	private String token;
	private String address;
	private Boolean isLogin;
	private RoleInfo role;
	
	public UserInfo(UUID id, String userName, String fullName, String phone, String status, Long loginFailedCount,
			String email, String token, String address, Boolean isLogin, RoleInfo role) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.phone = phone;
		this.status = status;
		this.loginFailedCount = loginFailedCount;
		this.email = email;
		this.token = token;
		this.address = address;
		this.isLogin = isLogin;
		this.role = role;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getLoginFailedCount() {
		return loginFailedCount;
	}
	public void setLoginFailedCount(Long loginFailedCount) {
		this.loginFailedCount = loginFailedCount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getIsLogin() {
		return isLogin;
	}
	public void setIsLogin(Boolean isLogin) {
		this.isLogin = isLogin;
	}
	public RoleInfo getRole() {
		return role;
	}
	public void setRole(RoleInfo role) {
		this.role = role;
	}
	
	
}
