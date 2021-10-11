package com.myapp.employeemanager.exception;

public class UserNotFountException extends RuntimeException{
    public UserNotFountException(String message) {
        super(message);
    }
}
