package com.recipers.bugbug.bugs.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bug_choices")
public class BugChoice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long stepId;
    
    private String title;
    
    private Boolean isCorrect;
    
    // 기본 생성자
    public BugChoice() {}
}