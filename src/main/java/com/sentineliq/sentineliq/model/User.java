package com.sentineliq.sentineliq.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Integer accountAgeDays;
    private Integer previousFlagCount;

    // getters and setters
}
