package com.kyrostechnologies.bar.bar.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class DistributorModel {
	@JsonProperty("Id")

	public String id;
	@JsonProperty("UserProfileId")

	public String userProfileId;
	@JsonProperty("DistributorName")

	public String distributorName;
	public DistributorModel(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserProfileId() {
		return userProfileId;
	}
	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
	}
	public String getDistributorName() {
		return distributorName;
	}
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}
	

}
