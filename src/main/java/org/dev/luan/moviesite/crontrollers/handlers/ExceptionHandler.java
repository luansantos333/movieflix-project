package org.dev.luan.moviesite.crontrollers.handlers;

import jakarta.servlet.http.HttpServletRequest;
import org.dev.luan.moviesite.services.exceptions.DatabaseException;
import org.dev.luan.moviesite.services.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.Instant;

@ControllerAdvice
public class ExceptionHandler {


    @org.springframework.web.bind.annotation.ExceptionHandler (ResourceNotFoundException.class)
    public ResponseEntity<CustomError> handleResourceNotFound (ResourceNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomError err = new CustomError(Instant.now(), status.value(), status.getReasonPhrase(), e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);

    }

    @org.springframework.web.bind.annotation.ExceptionHandler (DatabaseException.class)
    public ResponseEntity<CustomError>  handleDatabaseException (DatabaseException e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.CONFLICT;
        CustomError err = new CustomError(Instant.now(), status.value(), status.getReasonPhrase(), e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);

    }


}
