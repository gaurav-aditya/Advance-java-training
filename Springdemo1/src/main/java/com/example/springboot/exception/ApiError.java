package com.example.springboot.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiError {
	private HttpStatus status;
	private LocalDateTime timestamp;

	private String msg;

	public ApiError() {
		timestamp = LocalDateTime.now();
	}

	public ApiError(HttpStatus status) {
		this();
		this.status = status;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setMessage(String message) {
		// TODO Auto-generated method stub
		System.out.print("hello");
	}

	

}
