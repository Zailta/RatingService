package com.microservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservice.Exception.CustomException.ResourceNotFoundException;
import com.microservice.Utility.APIResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse> resourceNotFoundException(ResourceNotFoundException ex){
		String message = ex.getMessage();
		APIResponse apiResponse = new  APIResponse(message, false, HttpStatus.NOT_FOUND);
		return new ResponseEntity<APIResponse>(apiResponse,HttpStatus.NOT_FOUND);
		
	}

}
