package ru.kata.spring.boot_security.demo.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class UserExHandler {
    @ExceptionHandler(UserExeption.class)
    public ResponseEntity<UserIncorData> handleException(UserExeption exception){
        UserIncorData data = new UserIncorData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<UserIncorData> handleException(Exception exception){
        UserIncorData data = new UserIncorData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
