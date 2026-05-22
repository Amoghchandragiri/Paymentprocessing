package com.example.paymentprocessing.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String senderName;

    private String receiverName;

    private Double amount;

    private String status;

    private String transactionType;

    private LocalDateTime createdAt = LocalDateTime.now();
}