package com.kyrostechnologies.bar.bar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;


public class SectionBarResponse {
	@JsonProperty("IsSuccess")

	public boolean isSuccess;
	@JsonProperty("Message")

	public String message;
	@JsonProperty("Model")

	public ArrayList<InsertSectionModel>model =new ArrayList<InsertSectionModel>();
	public SectionBarResponse(){
		
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
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<InsertSectionModel> getModel() {
		return model;
	}
	public void setModel(ArrayList<InsertSectionModel> model) {
		this.model = model;
	}
	
	
}
