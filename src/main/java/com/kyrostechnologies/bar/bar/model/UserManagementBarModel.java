package com.kyrostechnologies.bar.bar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;


public class UserManagementBarModel {
	@JsonProperty("Id")

public String id;
	@JsonProperty("BarId")
	public int barId;

	@JsonProperty("VenueName")
	public String venueName;
	
	@JsonProperty("Country")
	public String country;
	@JsonProperty("Password")
	public String password;
	
	@JsonProperty("UserProfileId")

public String userProfileId;
	@JsonProperty("BarName")

public String barName;
	@JsonProperty("CreatedOn")

public String createdOn;
	@JsonProperty("ModifiedOn")

public String modifiedOn;
	@JsonProperty("UserManagementId")

public String userManagementId;
	@JsonProperty("UserName")

public String userName;
	@JsonProperty("UserEmail")

public String userEmail;
	@JsonProperty("UserRole")

public String userRole;
	@JsonProperty("BarList")

public ArrayList<InsertUserManagementBarModel>barList=new ArrayList<InsertUserManagementBarModel>();
	@JsonProperty("ParentUserProfileId")
	public String parentUserProfileId;
public UserManagementBarModel(){
	
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
public String getUserManagementId() {
	return userManagementId;
}
public void setUserManagementId(String userManagementId) {
	this.userManagementId = userManagementId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserRole() {
	return userRole;
}
public void setUserRole(String userRole) {
	this.userRole = userRole;
}
public ArrayList<InsertUserManagementBarModel> getBarList() {
	return barList;
}
public void setBarList(ArrayList<InsertUserManagementBarModel> barList) {
	this.barList = barList;
}
public int getBarId() {
	return barId;
}

public String getVenueName() {
	return venueName;
}
public void setVenueName(String venueName) {
	this.venueName = venueName;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public void setBarId(int barId) {
	this.barId = barId;
}
public String getParentUserProfileId() {
	return parentUserProfileId;
}
public void setParentUserProfileId(String parentUserProfileId) {
	this.parentUserProfileId = parentUserProfileId;
}


}
