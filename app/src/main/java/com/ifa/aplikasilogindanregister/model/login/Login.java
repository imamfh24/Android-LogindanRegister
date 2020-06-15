package com.ifa.aplikasilogindanregister.model.login;

import com.google.gson.annotations.SerializedName;

public class Login{

	@SerializedName("data")
	private LoginData loginData;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private boolean status;

	public void setLoginData(LoginData loginData){
		this.loginData = loginData;
	}

	public LoginData getLoginData(){
		return loginData;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}
}