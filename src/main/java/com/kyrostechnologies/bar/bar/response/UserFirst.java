package com.kyrostechnologies.bar.bar.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.kyrostechnologies.bar.bar.model.User;

import java.util.List;

public class UserFirst {
    @JsonProperty("IsSuccess")

    public boolean isSuccess;
    @JsonProperty("Message")

    public String message;
    @JsonProperty("UserList")

    public List<User> userList;

    public UserFirst(){

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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


}
