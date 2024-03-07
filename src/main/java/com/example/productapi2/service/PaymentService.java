package com.example.productapi2.service;

import com.example.productapi2.dto.PaymentDto;

import java.util.List;

public interface PaymentService {

    List<PaymentDto> getAll();

    PaymentDto getById(int id);

    void savePayment(PaymentDto paymentDto);

    void deletePayment(int id);




}
