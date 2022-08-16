package com.library.project.handler.ex;

import java.util.Map;

import lombok.Getter;

@Getter
public class CustomValidationApiException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private Map<String, String> errorMap;
	
	public CustomValidationApiException(String message) {
		super(message);
	}
	public CustomValidationApiException(String message, Map<String, String>errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
}
