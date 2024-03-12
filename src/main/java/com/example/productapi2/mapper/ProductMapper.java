package com.example.productapi2.mapper;

import com.example.productapi2.dto.productDto.ProductRequestDto;
import com.example.productapi2.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductRequestDto toProdudctRequestDto(Product product);

    Product toProductEntity(ProductRequestDto productRequestDto);
}
