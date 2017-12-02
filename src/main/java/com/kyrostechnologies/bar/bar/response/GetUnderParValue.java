package com.kyrostechnologies.bar.bar.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUnderParValue {
	@JsonProperty("IsSuccess")

	public boolean isSuccess;
	@JsonProperty("Message")

	public String message;
	@JsonProperty("UnderParValue")

	public String underParValue;
	public GetUnderParValue(){
		
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
	public String getUnderParValue() {
		return underParValue;
	}
	public void setUnderParValue(String underParValue) {
		this.underParValue = underParValue;
	}
	
}
