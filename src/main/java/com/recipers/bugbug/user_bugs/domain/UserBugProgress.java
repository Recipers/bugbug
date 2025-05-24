package com.recipers.bugbug.user_bugs.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_bug_progress")
public class UserBugProgress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long userId;
    
    private Long bugId;
    
    private Integer currentStep;
    
    private Integer remainingLife;
    
    private Boolean isCompleted;
    
    private LocalDateTime lastAttemptedAt;

}