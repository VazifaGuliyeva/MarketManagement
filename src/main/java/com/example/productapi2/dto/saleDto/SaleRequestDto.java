package com.example.productapi2.dto.saleDto;

import com.example.productapi2.entity.Warehouse;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class SaleRequestDto {

    String productName;
    Long deliveryDate;
    Long paymentDate;
    BigDecimal quantity;
    String unit;
    BigDecimal vat;
    BigDecimal price;
    String fkProductId;
    String fkWarehouseId;
    String productCategory;

}
