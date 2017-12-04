package com.kyrostechnologies.bar.bar.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RegistrationResponse {
    @JsonProperty("IsSuccess")

    public boolean isSuccess;
    @JsonProperty("Message")

    public String message;

    public RegistrationResponse(){

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
