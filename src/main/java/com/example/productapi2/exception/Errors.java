package com.example.productapi2.exception;

import java.time.LocalDateTime;

public record Errors (

        LocalDateTime localDateTime,
        String message,
        String details
){
}
