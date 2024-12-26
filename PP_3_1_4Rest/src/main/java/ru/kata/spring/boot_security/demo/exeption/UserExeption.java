package ru.kata.spring.boot_security.demo.exeption;

import lombok.Data;

@Data
public class UserExeption extends RuntimeException {
    public UserExeption(String message) {
        super(message);
    }
}
