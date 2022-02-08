package com.example.hcs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "drug_industry")
public class DrugIndustry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "industry_id")
	private Industry industry;
	@ManyToOne
	@JoinColumn(name = "drug_id")
	private Drug drug;
	public DrugIndustry() {
		// TODO Auto-generated constructor stub
	}
	public DrugIndustry(Industry industry, Drug drug) {
		super();
		this.industry = industry;
		this.drug = drug;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Industry getIndustry() {
		return industry;
	}
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	
}
