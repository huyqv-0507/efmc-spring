package com.example.hcs.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medical_records")
public class MedicalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Date dateTreatment;
	@Column(nullable = true)
	private Date dateFinished;
	@Column(nullable = false)
	private String patientName;
	@Column(nullable = true)
	private BigDecimal totalDebt;
	
	@ManyToOne
	@JoinColumn(name = "pharmacy_id")
	private Pharmacy pharmacy;
	@OneToMany(mappedBy = "medicalRecord")
	private List<Prescription> prescription;
	@OneToMany(mappedBy = "medicalRecord")
	private List<MedicalRecordDisease> medicalRecordDiseases;
	@OneToMany(mappedBy = "medicalRecord")
	private List<MedicalInstructionImage> medicalInstructionImages;
	public MedicalRecord() {
		// TODO Auto-generated constructor stub
	}
	public MedicalRecord(Date dateTreatment, Date dateFinished, String patientName, BigDecimal totalDebt,
			Pharmacy pharmacy, List<Prescription> prescription, List<MedicalRecordDisease> medicalRecordDiseases,
			List<MedicalInstructionImage> medicalInstructionImages) {
		super();
		this.dateTreatment = dateTreatment;
		this.dateFinished = dateFinished;
		this.patientName = patientName;
		this.totalDebt = totalDebt;
		this.pharmacy = pharmacy;
		this.prescription = prescription;
		this.medicalRecordDiseases = medicalRecordDiseases;
		this.medicalInstructionImages = medicalInstructionImages;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateTreatment() {
		return dateTreatment;
	}
	public void setDateTreatment(Date dateTreatment) {
		this.dateTreatment = dateTreatment;
	}
	public Date getDateFinished() {
		return dateFinished;
	}
	public void setDateFinished(Date dateFinished) {
		this.dateFinished = dateFinished;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public BigDecimal getTotalDebt() {
		return totalDebt;
	}
	public void setTotalDebt(BigDecimal totalDebt) {
		this.totalDebt = totalDebt;
	}
	public Pharmacy getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}
	public List<Prescription> getPrescription() {
		return prescription;
	}
	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
	}
	public List<MedicalRecordDisease> getMedicalRecordDiseases() {
		return medicalRecordDiseases;
	}
	public void setMedicalRecordDiseases(List<MedicalRecordDisease> medicalRecordDiseases) {
		this.medicalRecordDiseases = medicalRecordDiseases;
	}
	public List<MedicalInstructionImage> getMedicalInstructionImages() {
		return medicalInstructionImages;
	}
	public void setMedicalInstructionImages(List<MedicalInstructionImage> medicalInstructionImages) {
		this.medicalInstructionImages = medicalInstructionImages;
	}
	
	
}
