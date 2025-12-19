package com.example.demo.exception;

import org.springframework.web.bind.MethodArgumentNotValidation;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> hello(MethodArgumentNotValidException ex){
        Map<String,String> map=new HashMap<>();
        ex.getBindingresult().getFieldErrors().forEach(error -> map.put(error.getField(),error.getDefaultMessage()));
        return new ResponseEntity<>(map,HttpStatus.)
    }

    @ExceptionHandler(PasswordNotMatchCri.class)
    public String hi(){
        return "Hi";
    }
}
