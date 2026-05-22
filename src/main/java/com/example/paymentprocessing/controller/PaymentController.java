package com.example.paymentprocessing.controller;

import com.example.paymentprocessing.entity.Payment;
import com.example.paymentprocessing.repository.PaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "http://localhost:3000")
public class PaymentController {

    private final PaymentRepository repository;

    public PaymentController(PaymentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return repository.findAll();
    }

    @PostMapping
    public Payment savePayment(@RequestBody Payment payment) {
        return repository.save(payment);
    }
}