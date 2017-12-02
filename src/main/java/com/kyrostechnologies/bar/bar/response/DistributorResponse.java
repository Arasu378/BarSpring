package com.kyrostechnologies.bar.bar.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kyrostechnologies.bar.bar.model.DistributorModel;

import java.util.ArrayList;
import java.util.List;


public class DistributorResponse {
	@JsonProperty("IsSuccess")

public boolean isSuccess;
	@JsonProperty("Message")

public String message;
	@JsonProperty("DistributorsList")

public List<DistributorModel> distributorsList=new ArrayList<DistributorModel>();
public DistributorResponse(){
	
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
public List<DistributorModel> getDistributorsList() {
	return distributorsList;
}
public void setDistributorsList(List<DistributorModel> distributorsList) {
	this.distributorsList = distributorsList;
}

}
