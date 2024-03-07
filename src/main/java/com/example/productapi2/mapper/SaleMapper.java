package com.example.productapi2.mapper;

import com.example.productapi2.dto.saleDto.SaleRequestDto;
import com.example.productapi2.entity.Sale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleMapper {

    SaleRequestDto toSaleDto(Sale sale);

    Sale toSale(SaleRequestDto saleRequestDto);


}
