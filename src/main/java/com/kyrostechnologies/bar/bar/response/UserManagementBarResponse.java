package com.kyrostechnologies.bar.bar.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kyrostechnologies.bar.bar.model.UserManagementBarModel;

import java.util.ArrayList;
import java.util.List;


public class UserManagementBarResponse {
	@JsonProperty("IsSuccess")

	public boolean isSuccess;
	@JsonProperty("Message")

	public String message;
	
	@JsonProperty("VenueName")
	public String venueName;
	
	@JsonProperty("Country")
	public String country;
	@JsonProperty("Password")
	public String password;
	
	@JsonProperty("UserManagementList")

	public List<UserManagementBarModel>userManagementList=new ArrayList<UserManagementBarModel>();
	public UserManagementBarResponse(){
		
	}
	public boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMessage() {
		return message;
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
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<UserManagementBarModel> getUserManagementList() {
		return userManagementList;
	}
	public void setUserManagementList(
			List<UserManagementBarModel> userManagementList) {
		this.userManagementList = userManagementList;
	}
	

}
