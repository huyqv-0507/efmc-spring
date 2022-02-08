package com.example.hcs.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "industries")
public class Industry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "industry")
	private List<PharmacyIndustry> pharmacyIndustries;
	@OneToMany(mappedBy = "industry")
	private List<DrugIndustry> drugIndustries;
	public Industry() {
		// TODO Auto-generated constructor stub
	}
	public Industry(String name, List<PharmacyIndustry> pharmacyIndustries, List<DrugIndustry> drugIndustries) {
		super();
		this.name = name;
		this.pharmacyIndustries = pharmacyIndustries;
		this.drugIndustries = drugIndustries;
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
	public List<PharmacyIndustry> getPharmacyIndustries() {
		return pharmacyIndustries;
	}
	public void setPharmacyIndustries(List<PharmacyIndustry> pharmacyIndustries) {
		this.pharmacyIndustries = pharmacyIndustries;
	}
	public List<DrugIndustry> getDrugIndustries() {
		return drugIndustries;
	}
	public void setDrugIndustries(List<DrugIndustry> drugIndustries) {
		this.drugIndustries = drugIndustries;
	}
	
}
