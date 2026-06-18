package com.sentineliq.sentineliq.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String userId;
    private String merchantId;
    private String location;
    private Double fraudScore;
    private LocalDateTime timestamp;

    // getters and setters
}
