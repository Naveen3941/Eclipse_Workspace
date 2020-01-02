package com.validation.model;

public class ErrorResponse {

	private String statusCode;
	private String statusMessage;

	public ErrorResponse() {
		super();
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

}
