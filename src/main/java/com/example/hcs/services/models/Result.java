package com.example.hcs.services.models;

public class Result<T> {
	private boolean isSuccess;
	private String message;
	private T data;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(boolean isSuccess, String message, T data) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
		this.data = data;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
