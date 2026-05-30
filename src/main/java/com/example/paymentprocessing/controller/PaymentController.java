package com.example.paymentprocessing.controller;

import com.example.paymentprocessing.entity.Payment;
import com.example.paymentprocessing.repository.PaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
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

        System.out.println("POST REQUEST RECEIVED");
        System.out.println(payment.getSenderName());
        System.out.println(payment.getReceiverName());
        System.out.println(payment.getAmount());

        return repository.save(payment);
    }
}
