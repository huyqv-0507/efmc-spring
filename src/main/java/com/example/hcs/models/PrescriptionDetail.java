package com.example.hcs.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prescription_details")
public class PrescriptionDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String drugName;
	@Column(nullable = false)
	private BigDecimal unitPrice;
	@Column(nullable = false)
	private String useTime;
	@Column(nullable = false)
	private Integer morning;
	@Column(nullable = false)
	private Integer noon;
	@Column(nullable = false)
	private Integer afternoon;
	@Column(nullable = false)
	private Integer night;
	@Column(nullable = true)
	private String note;

	@ManyToOne
	@JoinColumn(name = "prescription_id")
	private Prescription prescription;
	@ManyToOne
	@JoinColumn(name="drug_id")
	private Drug drug;
	
	public PrescriptionDetail() {
		// TODO Auto-generated constructor stub
	}

	public PrescriptionDetail(String drugName, BigDecimal unitPrice, String useTime, Integer morning, Integer noon,
			Integer afternoon, Integer night, String note, Prescription prescription, Drug drug) {
		super();
		this.drugName = drugName;
		this.unitPrice = unitPrice;
		this.useTime = useTime;
		this.morning = morning;
		this.noon = noon;
		this.afternoon = afternoon;
		this.night = night;
		this.note = note;
		this.prescription = prescription;
		this.drug = drug;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public Integer getMorning() {
		return morning;
	}

	public void setMorning(Integer morning) {
		this.morning = morning;
	}

	public Integer getNoon() {
		return noon;
	}

	public void setNoon(Integer noon) {
		this.noon = noon;
	}

	public Integer getAfternoon() {
		return afternoon;
	}

	public void setAfternoon(Integer afternoon) {
		this.afternoon = afternoon;
	}

	public Integer getNight() {
		return night;
	}

	public void setNight(Integer night) {
		this.night = night;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	
}
