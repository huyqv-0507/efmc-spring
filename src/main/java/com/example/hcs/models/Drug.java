package com.example.hcs.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "drugs")
public class Drug {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String content;
	@Column(nullable = false)
	private String wrapper;
	@Column(nullable = false)
	private String unit;
	@Column(nullable = false)
	private BigDecimal unitPrice;
	@Column(nullable = false)
	private BigInteger quantity;

	@Column(nullable = true)
	private String brandName;
	@Column(nullable = true)
	private String mainIngredient;
	@Column(nullable = true)
	private String ingredient;
	@Column(nullable = true)
	private String description;

	@OneToMany(mappedBy = "drug")
	private List<DrugIndustry> drugIndustries;
	@OneToMany(mappedBy = "drug")
	private List<ConsignmentDrug> consignmentDrugs;
	@OneToMany(mappedBy = "drug")
	private List<PrescriptionDetail> prescriptionDetails;
	public Drug() {
		// TODO Auto-generated constructor stub
	}
	public Drug(String name, String content, String wrapper, String unit, BigDecimal unitPrice, BigInteger quantity,
			String brandName, String mainIngredient, String ingredient, String description,
			List<DrugIndustry> drugIndustries, List<ConsignmentDrug> consignmentDrugs,
			List<PrescriptionDetail> prescriptionDetails) {
		super();
		this.name = name;
		this.content = content;
		this.wrapper = wrapper;
		this.unit = unit;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.brandName = brandName;
		this.mainIngredient = mainIngredient;
		this.ingredient = ingredient;
		this.description = description;
		this.drugIndustries = drugIndustries;
		this.consignmentDrugs = consignmentDrugs;
		this.prescriptionDetails = prescriptionDetails;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWrapper() {
		return wrapper;
	}
	public void setWrapper(String wrapper) {
		this.wrapper = wrapper;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public BigInteger getQuantity() {
		return quantity;
	}
	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getMainIngredient() {
		return mainIngredient;
	}
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<DrugIndustry> getDrugIndustries() {
		return drugIndustries;
	}
	public void setDrugIndustries(List<DrugIndustry> drugIndustries) {
		this.drugIndustries = drugIndustries;
	}
	public List<ConsignmentDrug> getConsignmentDrugs() {
		return consignmentDrugs;
	}
	public void setConsignmentDrugs(List<ConsignmentDrug> consignmentDrugs) {
		this.consignmentDrugs = consignmentDrugs;
	}
	public List<PrescriptionDetail> getPrescriptionDetails() {
		return prescriptionDetails;
	}
	public void setPrescriptionDetails(List<PrescriptionDetail> prescriptionDetails) {
		this.prescriptionDetails = prescriptionDetails;
	}
	
}
