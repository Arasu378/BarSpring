package com.kyrostechnologies.bar.bar.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class InsertUserManagementBarModel {
	@JsonProperty("Id")

	public String id;
	@JsonProperty("UserManagementId")

	public int userManagementId;
	@JsonProperty("BarName")
 String barName;
	@JsonProperty("CreatedOn")

	public String createdOn;
	@JsonProperty("ModifiedOn")

	public String modifiedOn;
	@JsonProperty("UserProfileId")

	public String userProfileId;
	@JsonProperty("BarId")

	public int barId;
	public InsertUserManagementBarModel(){
		
	}
	public String getId() {
		return id;
	}
	
	public int getUserManagementId() {
		return userManagementId;
	}
	public void setUserManagementId(int userManagementId) {
		this.userManagementId = userManagementId;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBarName() {
		return barName;
	}
	public void setBarName(String barName) {
		this.barName = barName;
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
	
	public int getBarId() {
		return barId;
	}
	public void setBarId(int barId) {
		this.barId = barId;
	}
	public String getUserProfileId() {
		return userProfileId;
	}
	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
	}
	

}
