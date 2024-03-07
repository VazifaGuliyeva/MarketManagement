package com.example.productapi2.dto.saleDto;

import com.example.productapi2.entity.Warehouse;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class SaleRequestDto {

    String name;
    Long deliveryDate;
    Long paymentDate;

    BigDecimal quantity;
    BigDecimal vat;
    BigDecimal price;
//    Integer fkProductId;
    Warehouse fkWarehouseId;
}
