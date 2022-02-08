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
@Table(name = "disease")
public class Disease {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String code;
	@Column(nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "disease")
	private List<MedicalRecordDisease> medicalRecordDiseases;
	
	public Disease() {
		// TODO Auto-generated constructor stub
	}

	public Disease(String code, String name, List<MedicalRecordDisease> medicalRecordDiseases) {
		super();
		this.code = code;
		this.name = name;
		this.medicalRecordDiseases = medicalRecordDiseases;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MedicalRecordDisease> getMedicalRecordDiseases() {
		return medicalRecordDiseases;
	}

	public void setMedicalRecordDiseases(List<MedicalRecordDisease> medicalRecordDiseases) {
		this.medicalRecordDiseases = medicalRecordDiseases;
	}
	
}
