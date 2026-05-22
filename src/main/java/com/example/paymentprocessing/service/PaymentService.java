package com.example.paymentprocessing.service;

import com.example.paymentprocessing.entity.Payment;
import com.example.paymentprocessing.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment processPayment(Payment payment) {

        if(payment.getAmount() <= 0) {
            throw new RuntimeException("Invalid amount");
        }

        payment.setStatus("SUCCESS");

        return paymentRepository.save(payment);
    }

    public List<Payment> getAllTransactions() {
        return paymentRepository.findAll();
    }

    public Payment refundPayment(Long id) {

        Payment payment = paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        payment.setStatus("REFUNDED");

        return paymentRepository.save(payment);
    }
}