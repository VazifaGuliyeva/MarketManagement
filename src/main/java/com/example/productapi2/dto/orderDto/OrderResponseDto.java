package com.example.productapi2.dto.orderDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto {


    String name;
    String category;
    String fkWarehhouseId;
    String fkUserId;
    String fkProductId;
}
