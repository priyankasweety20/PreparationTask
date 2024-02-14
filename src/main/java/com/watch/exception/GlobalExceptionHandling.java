package com.watch.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(value=NoSuchElementException.class)
	public ResponseEntity<Object> noSuchElementExceptionHandling(NoSuchElementException nse){
		return new ResponseEntity<>(nse.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=NameNotFoundException.class)
	public ResponseEntity<Object> nameNotFoundExceptionHandling(NameNotFoundException nfe){
		return new ResponseEntity<>(nfe.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=PriceNotFoundException.class)
	public ResponseEntity<Object> priceNotFoundExceptionHandling(PriceNotFoundException p){
		return new ResponseEntity<>(p.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	

}
