package com.recipers.bugbug.user_bugs.domain;


import com.recipers.bugbug.bugs.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_bug_step_answers")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserBugStepAnswer extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long progressId;

    @Column
    private Long stepId;

    @Column
    private Long choiceId;

    @Column
    private Boolean isCorrect;

    @Column
    private LocalDateTime answeredAt;
}
