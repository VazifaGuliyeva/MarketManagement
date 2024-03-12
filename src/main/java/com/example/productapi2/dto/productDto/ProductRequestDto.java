package com.example.productapi2.dto.productDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {

    String active;
    String fkCategoryId;
    Integer fkGroupId;
    String name;
    String description;
    String guarante;
    String status;
    Integer fkWarehouseId;
    Integer fkDetails;
}
