package com.recipers.bugbug.bugs.domain;


import com.recipers.bugbug.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bug_choices")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BugChoice extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long stepId;

    @Column
    private String title;

    @Column
    private Boolean isCorrect;
}
