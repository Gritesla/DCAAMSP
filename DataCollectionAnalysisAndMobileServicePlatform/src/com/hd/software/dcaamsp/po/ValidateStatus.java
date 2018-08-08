package com.hd.software.dcaamsp.po;

public class ValidateStatus {

	private Integer status;

	private String message;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "{ValidateStatus:{\"status\":" + status + ",\"message\""
				+ message + "}}";
	}

}
