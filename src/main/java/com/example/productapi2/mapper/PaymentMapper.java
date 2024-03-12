package com.example.productapi2.mapper;

import com.example.productapi2.dto.PaymentDto.PaymentRequestDto;
import com.example.productapi2.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentRequestDto toPaymentRequestDto(Payment payment);;


    Payment toPayment(PaymentRequestDto paymentRequestDto);


}
