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
@Table(name = "medical_instruction_images")
public class MedicalInstructionImage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "medicalInstructionType_id")
	private MedicalInstructionType medicalInstructionType;
	@ManyToOne
	@JoinColumn(name = "medicalRecord_id")
	private MedicalRecord medicalRecord;
	@OneToMany(mappedBy = "medicalInstructionImage")
	private List<MedicalRecordImage> medicalRecordImages;
	public MedicalInstructionImage() {
		// TODO Auto-generated constructor stub
	}
	public MedicalInstructionImage(MedicalInstructionType medicalInstructionType,
			List<MedicalRecordImage> medicalRecordImages) {
		super();
		this.medicalInstructionType = medicalInstructionType;
		this.medicalRecordImages = medicalRecordImages;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MedicalInstructionType getMedicalInstructionType() {
		return medicalInstructionType;
	}
	public void setMedicalInstructionType(MedicalInstructionType medicalInstructionType) {
		this.medicalInstructionType = medicalInstructionType;
	}
	public List<MedicalRecordImage> getMedicalRecordImages() {
		return medicalRecordImages;
	}
	public void setMedicalRecordImages(List<MedicalRecordImage> medicalRecordImages) {
		this.medicalRecordImages = medicalRecordImages;
	}
	
}
