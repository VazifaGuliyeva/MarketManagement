package com.example.productapi2.mapper;

import com.example.productapi2.dto.PaymentDto;
import com.example.productapi2.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentDto toPaymentDto(Payment payment);

    Payment toPayment(PaymentDto paymentDto);
}
