package com.example.paymentprocessing.controller;

import com.example.paymentprocessing.entity.Payment;
import com.example.paymentprocessing.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "http://localhost:3000")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public Payment processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @GetMapping
    public List<Payment> getTransactions() {
        return paymentService.getAllTransactions();
    }

    @PutMapping("/refund/{id}")
    public Payment refundPayment(@PathVariable Long id) {
        return paymentService.refundPayment(id);
    }
}