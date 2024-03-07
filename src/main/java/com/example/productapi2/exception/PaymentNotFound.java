package com.example.productapi2.exception;

public class PaymentNotFound extends RuntimeException{

    public PaymentNotFound(String message) {

        super(message);
    }
}
