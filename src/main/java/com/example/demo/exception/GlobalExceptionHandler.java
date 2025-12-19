package com.example.demo.exception;

import org.springframework.web.bind.MethodArgumentNotValidation;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> hello(){
        return "hello";
    }

    @ExceptionHandler(PasswordNotMatchCri.class)
    public String hi(){
        return "Hi";
    }
}
