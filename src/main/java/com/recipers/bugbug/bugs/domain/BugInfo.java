package com.recipers.bugbug.bugs.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bug_info")
public class BugInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long bugId;
    
    private String title;
    
    private String content;
    
    private Integer screenOrder;
    
    // 기본 생성자
    public BugInfo() {}
}