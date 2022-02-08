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
@Table(name = "imgs")
public class Img {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "medicalRecordImage_id")
	private MedicalRecordImage medicalRecordImage;
	public Img() {
		// TODO Auto-generated constructor stub
	}
	public Img(String url, MedicalRecordImage medicalRecordImage) {
		super();
		this.url = url;
		this.medicalRecordImage = medicalRecordImage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public MedicalRecordImage getMedicalRecordImage() {
		return medicalRecordImage;
	}
	public void setMedicalRecordImage(MedicalRecordImage medicalRecordImage) {
		this.medicalRecordImage = medicalRecordImage;
	}
	
}
