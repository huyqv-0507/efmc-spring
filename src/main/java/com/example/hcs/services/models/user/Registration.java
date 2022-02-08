package com.example.hcs.services.models.user;

import javax.validation.constraints.Size;


public class Registration {
	
	@Size(min=6, max=12, message = "Username's length from 6 to 12 chars!")
	private String userName;
	private String password;
	private String confirmPassword;
	private String fullName;
	private long roleId;
	private String address;
	private String email;
	private String phone;
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	public Registration(String userName, String password, String confirmPassword, String fullName, long roleId,
			String address, String email, String phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.fullName = fullName;
		this.roleId = roleId;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
