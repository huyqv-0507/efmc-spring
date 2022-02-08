package com.example.hcs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pharmacy_industries")
public class PharmacyIndustry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "pharmacy_id")
	private Pharmacy pharmacy;
	@ManyToOne
	@JoinColumn(name = "industry_id")
	private Industry industry;
	public PharmacyIndustry() {
		// TODO Auto-generated constructor stub
	}
	public PharmacyIndustry(Pharmacy pharmacy, Industry industry) {
		super();
		this.pharmacy = pharmacy;
		this.industry = industry;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Pharmacy getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}
	public Industry getIndustry() {
		return industry;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	
}
