package com.recipers.bugbug.users.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String email;
    
    private String passwordHash;
    
    private String nickname;
    
    private String socialProvider;
    
    private String socialId;
    
    private LocalDateTime createdAt;
    
    // 기본 생성자
    public User() {}
    
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}