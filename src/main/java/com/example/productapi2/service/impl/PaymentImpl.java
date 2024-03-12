package com.example.productapi2.service.impl;

import com.example.productapi2.dto.PaymentDto.PaymentRequestDto;
import com.example.productapi2.dto.PaymentDto.PaymentResponseDto;
import com.example.productapi2.entity.Payment;
import com.example.productapi2.mapper.PaymentMapper;
import com.example.productapi2.repository.PaymentRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class PaymentImpl {


    PaymentRepository paymentRepository;

    PaymentMapper paymentMapper;


    public List<PaymentRequestDto> getAll(){
        return paymentRepository.findAll().stream().map(paymentMapper::toPaymentRequestDto).toList();
    }

    public void savePayment(PaymentRequestDto paymentRequestDto){
        Payment payment=paymentMapper.toPayment(paymentRequestDto);

        paymentRepository.save(payment);
    }



}
