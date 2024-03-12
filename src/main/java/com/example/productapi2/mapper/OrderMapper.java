package com.example.productapi2.mapper;

import com.example.productapi2.dto.orderDto.OrderResponseDto;
import com.example.productapi2.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderResponseDto toOrderResponseDto(Order order);

    Order toOrder(OrderResponseDto orderResponseDto);
}
