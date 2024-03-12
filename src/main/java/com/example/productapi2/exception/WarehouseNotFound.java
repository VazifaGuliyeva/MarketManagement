package com.example.productapi2.exception;

public class WarehouseNotFound extends RuntimeException{


    public WarehouseNotFound(String message){
        super(message);
    }
}
