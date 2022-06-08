package com.example.dominio.exceptions;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionResource {
	
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<StandardError> exceptionDefault(ApiException e, HttpServletRequest request){
		StandardError err = new StandardError();
		err.setTime(LocalDateTime.now());
		err.setStatus(HttpStatus.BAD_REQUEST.value());
		err.setError(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<StandardError> exceptionDefault(EmptyResultDataAccessException e, HttpServletRequest request){
		StandardError err = new StandardError();
		err.setTime(LocalDateTime.now());
		err.setStatus(HttpStatus.BAD_REQUEST.value());
		err.setError(e.getMessage());
		err.setPath(request.getRequestURI());
		err.setGenericError("Não foi encontrato um recurso na base de dados.");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<StandardError> exceptionDefault(DataIntegrityViolationException e, HttpServletRequest request){
		StandardError err = new StandardError();
		err.setTime(LocalDateTime.now());
		err.setStatus(HttpStatus.BAD_REQUEST.value());
		err.setError(e.getMessage());
		err.setPath(request.getRequestURI());
		err.setGenericError("Foi violado uma constraint da base de dados.");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}

}
