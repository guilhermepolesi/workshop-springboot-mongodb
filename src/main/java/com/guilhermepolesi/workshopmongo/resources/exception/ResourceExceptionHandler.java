package com.guilhermepolesi.workshopmongo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.guilhermepolesi.workshopmongo.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException error, HttpServletRequest servletRequest) {
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError error2 = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", error.getMessage(), servletRequest.getRequestURI());
		return ResponseEntity.status(status).body(error2);
	}
	

}
