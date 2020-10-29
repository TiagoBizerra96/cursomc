package com.example.demo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private Long timeStang;
	
	public StandardError(Integer status, String msg, Long timeStang) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStang = timeStang;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStang() {
		return timeStang;
	}

	public void setTimeStang(Long timeStang) {
		this.timeStang = timeStang;
	}
	
	
	
}
