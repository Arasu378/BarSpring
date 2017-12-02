package com.kyrostechnologies.bar.bar.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserTotalBottleResponse {
	@JsonProperty("TotalBottles")

public String totalBottles;
	@JsonProperty("IsSuccess")

public boolean isSuccess;
	@JsonProperty("Message")

public String message;
public GetUserTotalBottleResponse(){
	
}
public String getTotalBottles() {
	return totalBottles;
}
public void setTotalBottles(String totalBottles) {
	this.totalBottles = totalBottles;
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

}
