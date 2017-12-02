package com.kyrostechnologies.bar.bar.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertSectionModel {
	@JsonProperty("BarId")

	public int barId;
	@JsonProperty("SectionName")

	public String sectionName;
	@JsonProperty("SectionId")

	public int sectionId;
	@JsonProperty("UserProfileId")

	public int userProfileId;
	@JsonProperty("ModifiedOn")

	public String modifiedOn;
	@JsonProperty("CreatedOn")

	public String createdOn;
	public InsertSectionModel(){
		
	}
	public int getBarId() {
		return barId;
	}
	public void setBarId(int barId) {
		this.barId = barId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public int getUserProfileId() {
		return userProfileId;
	}
	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}
	public String getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
}
