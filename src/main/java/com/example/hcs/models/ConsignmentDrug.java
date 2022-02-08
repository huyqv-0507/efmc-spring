package com.example.hcs.models;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consignment_drug")
public class ConsignmentDrug {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private BigInteger quantity;
	@Column(nullable = false)
	private BigDecimal cost;

	@ManyToOne
	@JoinColumn(name = "consignment_id")
	private Consignment consignment;
	@ManyToOne
	@JoinColumn(name = "drug_id")
	private Drug drug;
	public ConsignmentDrug() {
		// TODO Auto-generated constructor stub
	}
	public ConsignmentDrug(BigInteger quantity, BigDecimal cost, Consignment consignment, Drug drug) {
		super();
		this.quantity = quantity;
		this.cost = cost;
		this.consignment = consignment;
		this.drug = drug;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigInteger getQuantity() {
		return quantity;
	}
	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public Consignment getConsignment() {
		return consignment;
	}
	public void setConsignment(Consignment consignment) {
		this.consignment = consignment;
	}
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	
}
