package com.example.productapi2.controller;

import com.example.productapi2.dto.PaymentDto.PaymentRequestDto;
import com.example.productapi2.service.impl.PaymentImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@AllArgsConstructor
public class PaymentController {


    private final PaymentImpl paymentImpl;


    @GetMapping
    public List<PaymentRequestDto> getAll(){
        return paymentImpl.getAll();
    }
    @PostMapping
    public void savePayment(@RequestBody PaymentRequestDto paymentRequestDto){
        paymentImpl.savePayment(paymentRequestDto);
    }

}
