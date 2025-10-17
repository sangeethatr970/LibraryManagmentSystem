package com.DCL.SpringBoot.util;

public class ResponseStructure<LMS> {
	private int statuscode;
	private String message;
	private LMS data;

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LMS getData() {
		return data;
	}

	public void setData(LMS data) {
		this.data = data;
	}

}
