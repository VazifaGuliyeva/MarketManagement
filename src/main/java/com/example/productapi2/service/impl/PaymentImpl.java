package com.example.productapi2.service.impl;

import com.example.productapi2.dto.PaymentDto;
import com.example.productapi2.entity.Payment;
import com.example.productapi2.exception.PaymentNotFound;
import com.example.productapi2.mapper.PaymentMapper;
import com.example.productapi2.repository.PaymentRepository;
import com.example.productapi2.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class PaymentImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    private final PaymentMapper paymentMapper;
    @Override
    public List<PaymentDto> getAll() {
        return paymentRepository.findAll().stream().map(paymentMapper::toPaymentDto).toList();
    }

    @Override
    public PaymentDto getById(int id) {
        return paymentRepository.findById(id).stream().map(paymentMapper::toPaymentDto).findFirst().orElseThrow(()->new PaymentNotFound("Payment is not found"));
    }

    @Override
    public void savePayment(PaymentDto paymentDto) {

        Payment payment=paymentMapper.toPayment(paymentDto);

        paymentRepository.save(payment);

    }

    @Override
    public void deletePayment(int id) {

        paymentRepository.deleteById(id);

    }
}
