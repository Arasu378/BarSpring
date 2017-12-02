package com.kyrostechnologies.bar.bar.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertBarModel {
	@JsonProperty("UserProfileId")

	public int userProfileId;
	@JsonProperty("BarName")

	public String barName;
	@JsonProperty("BarId")

	public int barId;
	@JsonProperty("CreatedOn")

	public String createdOn;
	@JsonProperty("ModifiedOn")

	public String modifiedOn;
	public InsertBarModel(){
		
	}
	public int getUserProfileId() {
		return userProfileId;
	}
	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}
	public String getBarName() {
		return barName;
	}
	public void setBarName(String barName) {
		this.barName = barName;
	}
	public int getBarId() {
		return barId;
	}
	public void setBarId(int barId) {
		this.barId = barId;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
}
