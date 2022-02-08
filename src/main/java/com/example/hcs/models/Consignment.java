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
@Table(name = "consignments")
public class Consignment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Date dateImported;
	@Column(nullable = true)
	private String fromWhere;
	@Column(nullable = false)
	private BigDecimal totalCost;
	
	@ManyToOne
	@JoinColumn(name = "pharmacy_id")
	private Pharmacy pharmacy;
	@OneToMany(mappedBy = "consignment")
	private List<ConsignmentDrug> consignmentDrugs;
	public Consignment() {
		// TODO Auto-generated constructor stub
	}
	public Consignment(Date dateImported, String fromWhere, BigDecimal totalCost, Pharmacy pharmacy,
			List<ConsignmentDrug> consignmentDrugs) {
		super();
		this.dateImported = dateImported;
		this.fromWhere = fromWhere;
		this.totalCost = totalCost;
		this.pharmacy = pharmacy;
		this.consignmentDrugs = consignmentDrugs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateImported() {
		return dateImported;
	}
	public void setDateImported(Date dateImported) {
		this.dateImported = dateImported;
	}
	public String getFromWhere() {
		return fromWhere;
	}
	public void setFromWhere(String fromWhere) {
		this.fromWhere = fromWhere;
	}
	public BigDecimal getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
	public Pharmacy getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}
	public List<ConsignmentDrug> getConsignmentDrugs() {
		return consignmentDrugs;
	}
	public void setConsignmentDrugs(List<ConsignmentDrug> consignmentDrugs) {
		this.consignmentDrugs = consignmentDrugs;
	}
	
	
}
