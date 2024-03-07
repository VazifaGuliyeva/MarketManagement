package com.example.productapi2.controller;

import com.example.productapi2.dto.PaymentDto;
import com.example.productapi2.entity.Payment;
import com.example.productapi2.service.impl.PaymentImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentImpl paymentImpl;

    @GetMapping
    public List<PaymentDto> getAll(){
         return paymentImpl.getAll();
    }
    @GetMapping("/{id}")
    public PaymentDto getById(@PathVariable int id){
        return paymentImpl.getById(id);
    }
    @PostMapping
    public void addPayment(@RequestBody PaymentDto paymentDto){
        paymentImpl.savePayment(paymentDto);
    }
    @DeleteMapping("/{id}")
    public void deletePAyment(int id){
        paymentImpl.deletePayment(id);
    }
}
