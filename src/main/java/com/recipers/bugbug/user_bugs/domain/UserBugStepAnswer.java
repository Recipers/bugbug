package com.recipers.bugbug.user_bugs.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_bug_step_answers")
public class UserBugStepAnswer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long progressId;
    
    private Long stepId;
    
    private Long choiceId;
    
    private Boolean isCorrect;
    
    private LocalDateTime answeredAt;
    
    // 기본 생성자
    public UserBugStepAnswer() {}
}