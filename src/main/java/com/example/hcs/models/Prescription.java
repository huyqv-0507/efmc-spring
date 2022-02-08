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
@Table(name = "prescriptions")
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Date dateCreated;
	@Column(nullable = false)
	private Date dateStarted;
	@Column(nullable = false)
	private Date dateFinished;
	@Column(nullable = false)
	private String buyerName;
	@Column(nullable = false)
	private BigDecimal totalPrice;
	@Column(nullable = false)
	private String status;
	@Column(nullable = true)
	private String reasonCanceled;
	@Column(nullable = true)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "medicalRecord_id")
	private MedicalRecord medicalRecord;
	@OneToMany(mappedBy = "prescription")
	private List<PrescriptionDetail> prescriptionDetails;
	@OneToMany(mappedBy = "prescription")
	private List<DebtTransaction> debtTransactions;
	public Prescription() {
		// TODO Auto-generated constructor stub
	}
	public Prescription(Date dateCreated, Date dateStarted, Date dateFinished, String buyerName, BigDecimal totalPrice,
			String status, String reasonCanceled, String description, MedicalRecord medicalRecord,
			List<PrescriptionDetail> prescriptionDetails, List<DebtTransaction> debtTransactions) {
		super();
		this.dateCreated = dateCreated;
		this.dateStarted = dateStarted;
		this.dateFinished = dateFinished;
		this.buyerName = buyerName;
		this.totalPrice = totalPrice;
		this.status = status;
		this.reasonCanceled = reasonCanceled;
		this.description = description;
		this.medicalRecord = medicalRecord;
		this.prescriptionDetails = prescriptionDetails;
		this.debtTransactions = debtTransactions;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}
	public Date getDateFinished() {
		return dateFinished;
	}
	public void setDateFinished(Date dateFinished) {
		this.dateFinished = dateFinished;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReasonCanceled() {
		return reasonCanceled;
	}
	public void setReasonCanceled(String reasonCanceled) {
		this.reasonCanceled = reasonCanceled;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	public List<PrescriptionDetail> getPrescriptionDetails() {
		return prescriptionDetails;
	}
	public void setPrescriptionDetails(List<PrescriptionDetail> prescriptionDetails) {
		this.prescriptionDetails = prescriptionDetails;
	}
	public List<DebtTransaction> getDebtTransactions() {
		return debtTransactions;
	}
	public void setDebtTransactions(List<DebtTransaction> debtTransactions) {
		this.debtTransactions = debtTransactions;
	}
	
}
