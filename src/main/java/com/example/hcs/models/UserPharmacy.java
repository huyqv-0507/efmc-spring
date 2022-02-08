package com.example.hcs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_pharmacies")
public class UserPharmacy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private String status;
	@Column(nullable = true)
	private String ownerName;
	@Column(nullable = true)
	private String pharmacistName;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private User owner;
	@ManyToOne
	@JoinColumn(name = "pharmacist_id")
	private User pharmacist;
	@ManyToOne
	@JoinColumn(name = "pharmacy_id")
	private Pharmacy pharmacy;
	public UserPharmacy() {
		// TODO Auto-generated constructor stub
	}
	public UserPharmacy(String status, String ownerName, String pharmacistName, User owner, User pharmacist,
			Pharmacy pharmacy) {
		super();
		this.status = status;
		this.ownerName = ownerName;
		this.pharmacistName = pharmacistName;
		this.owner = owner;
		this.pharmacist = pharmacist;
		this.pharmacy = pharmacy;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPharmacistName() {
		return pharmacistName;
	}
	public void setPharmacistName(String pharmacistName) {
		this.pharmacistName = pharmacistName;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public User getPharmacist() {
		return pharmacist;
	}
	public void setPharmacist(User pharmacist) {
		this.pharmacist = pharmacist;
	}
	public Pharmacy getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}
	
}
