package com.bosonit.examenJPA.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExeptionManager {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<CustomError> methodEntityNotFoundException(EntityNotFoundException e) {
        CustomError customErrorInfo = new CustomError(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return new ResponseEntity<>(customErrorInfo, HttpStatus.NOT_FOUND);
    }


}
