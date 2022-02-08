package com.example.hcs.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "debt_transaction")
public class DebtTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String namePayback;
	@Column(nullable = false)
	private BigDecimal moneyPayback;
	@Column(nullable = false)
	private Date datePayback;
	
	@ManyToOne
	@JoinColumn(name = "prescription_id")
	private Prescription prescription;
	public DebtTransaction() {
		// TODO Auto-generated constructor stub
	}
	public DebtTransaction(String namePayback, BigDecimal moneyPayback, Date datePayback, Prescription prescription) {
		super();
		this.namePayback = namePayback;
		this.moneyPayback = moneyPayback;
		this.datePayback = datePayback;
		this.prescription = prescription;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNamePayback() {
		return namePayback;
	}
	public void setNamePayback(String namePayback) {
		this.namePayback = namePayback;
	}
	public BigDecimal getMoneyPayback() {
		return moneyPayback;
	}
	public void setMoneyPayback(BigDecimal moneyPayback) {
		this.moneyPayback = moneyPayback;
	}
	public Date getDatePayback() {
		return datePayback;
	}
	public void setDatePayback(Date datePayback) {
		this.datePayback = datePayback;
	}
	public Prescription getPrescription() {
		return prescription;
	}
	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}
	
}
