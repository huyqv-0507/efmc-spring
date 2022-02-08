package com.example.hcs.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pharmacies")
public class Pharmacy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private Date dateCreated;
	@Column(nullable = false)
	private String status;

	@OneToMany(mappedBy = "pharmacy")
	private List<UserPharmacy> userPharmacies;
	@OneToMany(mappedBy = "pharmacy")
	private List<PharmacyIndustry> pharmacyIndustries;
	@OneToMany(mappedBy = "pharmacy")
	private List<Consignment> consignments;
	@OneToMany(mappedBy = "pharmacy")
	private List<MedicalRecord> medicalRecords;
	
	public Pharmacy() {
		// TODO Auto-generated constructor stub
	}

	public Pharmacy(String name, String address, Date dateCreated, String status, List<UserPharmacy> userPharmacies,
			List<PharmacyIndustry> pharmacyIndustries, List<Consignment> consignments,
			List<MedicalRecord> medicalRecords) {
		super();
		this.name = name;
		this.address = address;
		this.dateCreated = dateCreated;
		this.status = status;
		this.userPharmacies = userPharmacies;
		this.pharmacyIndustries = pharmacyIndustries;
		this.consignments = consignments;
		this.medicalRecords = medicalRecords;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<UserPharmacy> getUserPharmacies() {
		return userPharmacies;
	}

	public void setUserPharmacies(List<UserPharmacy> userPharmacies) {
		this.userPharmacies = userPharmacies;
	}

	public List<PharmacyIndustry> getPharmacyIndustries() {
		return pharmacyIndustries;
	}

	public void setPharmacyIndustries(List<PharmacyIndustry> pharmacyIndustries) {
		this.pharmacyIndustries = pharmacyIndustries;
	}

	public List<Consignment> getConsignments() {
		return consignments;
	}

	public void setConsignments(List<Consignment> consignments) {
		this.consignments = consignments;
	}

	public List<MedicalRecord> getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
		this.medicalRecords = medicalRecords;
	}
	
}
