package com.kyrostechnologies.bar.bar.model;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UserTest implements Serializable {
	private static final long serialVersionUID=1L;
	@JsonProperty("Id")

	private int id;
	@JsonProperty("Name")

	private String name;
	@JsonProperty("Location")

	private String location;
	@JsonProperty("Mobile")

	private String mobile;
	@JsonProperty("UserProfileId")

	public int userProfileId;
	@JsonProperty("UserFirstName")

	public String userFirstName;
	@JsonProperty("UserLastName")

	public String userLastName;
	@JsonProperty("UserMobileNumber")

	public String userMobileNumber;
	@JsonProperty("UserEmail")

	public String userEmail;
	@JsonProperty("UserVenueName")

	public String userVenueName;
	@JsonProperty("UserCountry")

	public String userCountry;
	@JsonProperty("UserOftenInventory")

	public String userOftenInventory;
	@JsonProperty("UserInventoryTime")

	public int userInventoryTime;
	@JsonProperty("UserLastLogin")

	public String userLastLogin;
	@JsonProperty("IsActive")

	public boolean isActive;
	@JsonProperty("CreatedOn")

	public String createdOn;
	@JsonProperty("ModifiedOn")

	public String modifiedOn;
	@JsonProperty("Password")

	public String password;
	
	public UserTest(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserVenueName() {
		return userVenueName;
	}

	public void setUserVenueName(String userVenueName) {
		this.userVenueName = userVenueName;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserOftenInventory() {
		return userOftenInventory;
	}

	public void setUserOftenInventory(String userOftenInventory) {
		this.userOftenInventory = userOftenInventory;
	}

	public int getUserInventoryTime() {
		return userInventoryTime;
	}

	public void setUserInventoryTime(int userInventoryTime) {
		this.userInventoryTime = userInventoryTime;
	}

	public String getUserLastLogin() {
		return userLastLogin;
	}

	public void setUserLastLogin(String userLastLogin) {
		this.userLastLogin = userLastLogin;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
