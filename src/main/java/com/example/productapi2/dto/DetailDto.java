package com.example.productapi2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailDto {


    Double price;
    LocalDateTime creationDate;
    LocalDateTime expireDate;
    String color;
    String description;
    String fileUrl;

}
