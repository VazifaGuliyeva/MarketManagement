package com.example.productapi2.exception;

public class SaleNotFound extends RuntimeException{

    public SaleNotFound(String message){
        super(message);
    }
}
