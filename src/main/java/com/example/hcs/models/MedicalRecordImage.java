package com.example.hcs.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medical_record_images")
public class MedicalRecordImage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "medicalInstructionImage_id")
	private MedicalInstructionImage medicalInstructionImage;
	@ManyToOne
	@JoinColumn(name = "medicalRecord_id")
	private MedicalRecord medicalRecord;
	@OneToMany(mappedBy = "medicalRecordImage")
	private List<Img> imgs;
	public MedicalRecordImage() {
		// TODO Auto-generated constructor stub
	}
	public MedicalRecordImage(MedicalInstructionImage medicalInstructionImage, MedicalRecord medicalRecord,
			List<Img> imgs) {
		super();
		this.medicalInstructionImage = medicalInstructionImage;
		this.medicalRecord = medicalRecord;
		this.imgs = imgs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MedicalInstructionImage getMedicalInstructionImage() {
		return medicalInstructionImage;
	}
	public void setMedicalInstructionImage(MedicalInstructionImage medicalInstructionImage) {
		this.medicalInstructionImage = medicalInstructionImage;
	}
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	public List<Img> getImgs() {
		return imgs;
	}
	public void setImgs(List<Img> imgs) {
		this.imgs = imgs;
	}
	
}
