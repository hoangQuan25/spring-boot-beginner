package com.hoangquan.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    // define way to handle StudentNotFoundException in Http res
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        StudentErrorResponse res = new StudentErrorResponse();

        res.setStatus(HttpStatus.NOT_FOUND.value());
        res.setMessage(exc.getMessage());
        res.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
    }

    // define way to handle generic exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
        StudentErrorResponse res = new StudentErrorResponse();

        res.setStatus(HttpStatus.BAD_REQUEST.value());
        res.setMessage(exc.getMessage());
        res.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
    }
}
