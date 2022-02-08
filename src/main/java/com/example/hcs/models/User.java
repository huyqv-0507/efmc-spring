package com.example.hcs.models;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User {
	@Id
    @GeneratedValue(generator = "UUID")
	@GenericGenerator(
	        name = "UUID",
	        strategy = "org.hibernate.id.UUIDGenerator"
	    )
	private UUID id;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String fullName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = true)
	private String phone;
	@Column(nullable = false)
	private String status;
	@Column(nullable = false)
	private Long loginFailedCount;
	@Column(nullable = true)
	private String email;
	@Column(nullable = true)
	private String token;
	@Column(nullable = true)
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;
	
	@OneToMany(mappedBy = "owner")
	private List<UserPharmacy> ownerPharmacies;
	
	@OneToMany(mappedBy = "pharmacist")
	private List<UserPharmacy> pharmacistPharmacies;
	
	@Column(nullable = false, columnDefinition = "boolean default false")
	private Boolean isLogin;

	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(UUID id, String userName, String fullName, String password, String phone, String status,
			Long loginFailedCount, String email, String token, String address, Role role, Boolean isLogin) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.password = password;
		this.phone = phone;
		this.status = status;
		this.loginFailedCount = loginFailedCount;
		this.email = email;
		this.token = token;
		this.address = address;
		this.role = role;
		this.isLogin = isLogin;
	}

	public User(UUID id, String userName, String fullName, String password, String phone, String status,
			Long loginFailedCount, String email, String token, String address, Role role,
			List<UserPharmacy> ownerPharmacies, List<UserPharmacy> pharmacistPharmacies, Boolean isLogin) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.password = password;
		this.phone = phone;
		this.status = status;
		this.loginFailedCount = loginFailedCount;
		this.email = email;
		this.token = token;
		this.address = address;
		this.role = role;
		this.ownerPharmacies = ownerPharmacies;
		this.pharmacistPharmacies = pharmacistPharmacies;
		this.isLogin = isLogin;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Boolean getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(Boolean isLogin) {
		this.isLogin = isLogin;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<UserPharmacy> getOwnerPharmacies() {
		return ownerPharmacies;
	}

	public void setOwnerPharmacies(List<UserPharmacy> ownerPharmacies) {
		this.ownerPharmacies = ownerPharmacies;
	}

	public List<UserPharmacy> getPharmacistPharmacies() {
		return pharmacistPharmacies;
	}

	public void setPharmacistPharmacies(List<UserPharmacy> pharmacistPharmacies) {
		this.pharmacistPharmacies = pharmacistPharmacies;
	}
	@Override
	public String toString() {
		return "Username: " + this.userName;
	}
	
}
