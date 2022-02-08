package com.example.hcs.common;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.hcs.constants.ValidationConst;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

@RestControllerAdvice
public class HandleValidation {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
      MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            SimpleDateFormat timestampFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
            errors.put(ValidationConst.TIMESTAMP, timestampFormat.format(new Date()));
            errors.put(ValidationConst.STATUS, String.valueOf(HttpStatus.BAD_REQUEST.value()));
            errors.put(ValidationConst.ERROR_STATUS, HttpStatus.BAD_REQUEST.getReasonPhrase());
            errors.put(ValidationConst.FIELD_NAME, fieldName);
            errors.put(ValidationConst.ERROR_MESSAGE, errorMessage);
        });
        return errors;
    }
}
