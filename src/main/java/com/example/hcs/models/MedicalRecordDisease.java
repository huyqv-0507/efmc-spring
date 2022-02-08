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
@Table(name = "medical_record_diseases")
public class MedicalRecordDisease {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String diseaseDescription;

	@ManyToOne
	@JoinColumn(name = "medicalRecord_id")
	private MedicalRecord medicalRecord;
	@ManyToOne
	@JoinColumn(name = "disease_id")
	private Disease disease;
	
	public MedicalRecordDisease() {
		// TODO Auto-generated constructor stub
	}
	
	public MedicalRecordDisease(String diseaseDescription, MedicalRecord medicalRecord, Disease disease) {
		super();
		this.diseaseDescription = diseaseDescription;
		this.medicalRecord = medicalRecord;
		this.disease = disease;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiseaseDescription() {
		return diseaseDescription;
	}

	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}
	
	
}
