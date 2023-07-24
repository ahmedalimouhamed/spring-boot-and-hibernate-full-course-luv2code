package com.luv2code.demo.rest;

public class StudnetNotFoundException extends RuntimeException{
    public StudnetNotFoundException(String message) {
        super(message);
    }

    public StudnetNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudnetNotFoundException(Throwable cause) {
        super(cause);
    }
}
