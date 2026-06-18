package com.sentineliq.sentineliq.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fraud_alerts")
public class FraudAlert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long transactionId;
    private Double score;
    @Column(columnDefinition = "TEXT")
    private String agentReport;
    private LocalDateTime createdAt;

    // getters and setters
}
