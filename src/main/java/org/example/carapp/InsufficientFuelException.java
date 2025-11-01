package org.example.carapp;

public class InsufficientFuelException extends RuntimeException {
    public InsufficientFuelException(String message) {
        super(message);
    }
}
