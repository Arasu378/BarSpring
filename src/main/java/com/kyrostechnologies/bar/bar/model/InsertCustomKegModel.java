package com.kyrostechnologies.bar.bar.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertCustomKegModel {
	@JsonProperty("UserProfileId")

	private String  userProfileId;
	@JsonProperty("BarId")

	private String barId;
	@JsonProperty("SectionId")

	private String sectionId;
	@JsonProperty("LiquorName")

	private String liquorName;
	@JsonProperty("FullWeight")

	private String fullWeight;
	@JsonProperty("EmptyWeight")

	private String emptyWeight;
	@JsonProperty("Category")

	private String category;
	@JsonProperty("SubCategory")

	private String subCategory;
	@JsonProperty("ParValue")

	private String parValue;
	@JsonProperty("DistributorName")

	private String distributorName;
	@JsonProperty("Price")

	private String  price;
	@JsonProperty("BinNumber")

	private String binNumber;
	@JsonProperty("ProductCode")

	private String productcode;
	@JsonProperty("MinValue")

	private String minValue;
	@JsonProperty("MaxValue")

	private String maxVaule;
	@JsonProperty("Shots")

	private String shots;
	@JsonProperty("Type")

	private String type;
public InsertCustomKegModel(){
	
}
public String getUserProfileId() {
	return userProfileId;
}
public void setUserProfileId(String userProfileId) {
	this.userProfileId = userProfileId;
}
public String getBarId() {
	return barId;
}
public void setBarId(String barId) {
	this.barId = barId;
}
public String getSectionId() {
	return sectionId;
}
public void setSectionId(String sectionId) {
	this.sectionId = sectionId;
}
public String getLiquorName() {
	return liquorName;
}
public void setLiquorName(String liquorName) {
	this.liquorName = liquorName;
}
public String getFullWeight() {
	return fullWeight;
}
public void setFullWeight(String fullWeight) {
	this.fullWeight = fullWeight;
}
public String getEmptyWeight() {
	return emptyWeight;
}
public void setEmptyWeight(String emptyWeight) {
	this.emptyWeight = emptyWeight;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getSubCategory() {
	return subCategory;
}
public void setSubCategory(String subCategory) {
	this.subCategory = subCategory;
}
public String getParValue() {
	return parValue;
}
public void setParValue(String parValue) {
	this.parValue = parValue;
}
public String getDistributorName() {
	return distributorName;
}
public void setDistributorName(String distributorName) {
	this.distributorName = distributorName;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getBinNumber() {
	return binNumber;
}
public void setBinNumber(String binNumber) {
	this.binNumber = binNumber;
}
public String getProductcode() {
	return productcode;
}
public void setProductcode(String productcode) {
	this.productcode = productcode;
}
public String getMinValue() {
	return minValue;
}
public void setMinValue(String minValue) {
	this.minValue = minValue;
}
public String getMaxVaule() {
	return maxVaule;
}
public void setMaxVaule(String maxVaule) {
	this.maxVaule = maxVaule;
}
public String getShots() {
	return shots;
}
public void setShots(String shots) {
	this.shots = shots;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
