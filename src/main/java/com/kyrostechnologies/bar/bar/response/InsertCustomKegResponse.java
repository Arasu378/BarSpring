package com.kyrostechnologies.bar.bar.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.kyrostechnologies.bar.bar.model.InsertCustomKegModel;

import java.util.ArrayList;
import java.util.List;

public class InsertCustomKegResponse {
	@JsonProperty("IsSuccess")

private boolean isSuccess;
	@JsonProperty("Message")

private String message;
	@JsonProperty("CustomKeg")

private List<InsertCustomKegModel> customKeg=new ArrayList<InsertCustomKegModel>();
public InsertCustomKegResponse(){
	
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
public List<InsertCustomKegModel> getCustomKeg() {
	return customKeg;
}
public void setCustomKeg(List<InsertCustomKegModel> customKeg) {
	this.customKeg = customKeg;
}

}
