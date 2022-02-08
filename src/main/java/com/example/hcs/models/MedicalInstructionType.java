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
@Table(name = "medical_instruction_types")
public class MedicalInstructionType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "medicalInstructionType")
	private List<MedicalInstructionImage> medicalInstructionImages;
	public MedicalInstructionType() {
		// TODO Auto-generated constructor stub
	}
	public MedicalInstructionType(String name, List<MedicalInstructionImage> medicalInstructionImages) {
		super();
		this.name = name;
		this.medicalInstructionImages = medicalInstructionImages;
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
	public List<MedicalInstructionImage> getMedicalInstructionImages() {
		return medicalInstructionImages;
	}
	public void setMedicalInstructionImages(List<MedicalInstructionImage> medicalInstructionImages) {
		this.medicalInstructionImages = medicalInstructionImages;
	}
	
}
