package com.kyrostechnologies.bar.bar.model;


import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;


public class UserFirstTest {
	@JsonProperty("IsSucess")
	public boolean isSucess;
	@JsonProperty("Message")

	public String message;
	@JsonProperty("UserList")

	public List<UserTest>userList;
	
public UserFirstTest(){
	
}

public boolean getIsSucess() {
	return isSucess;
}

public void setIsSucess(boolean isSucess) {
	this.isSucess = isSucess;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public List<UserTest> getUserList() {
	return userList;
}

public void setUserList(List<UserTest> userList) {
	this.userList = userList;
}

}
