package com.luangomesb.learning.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {
    //confgure method to intercept the error
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardException> resourceNotFound(ResourceNotFoundException e,HttpServletRequest request){
	    String error = "Resource Not Found!";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardException err = new StandardException(Instant.now(), status.value(),error,e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler
    public ResponseEntity<StandardException> database(DatabaseException e, HttpServletRequest request){
        String error = "Database Exception!";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardException err = new StandardException(Instant.now(), status.value(),error,e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);

    }


}
