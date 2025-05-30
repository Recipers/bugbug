package com.recipers.bugbug.user_bugs.domain;


import com.recipers.bugbug.common.BaseEntity;
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
@Table(name = "user_bug_progress")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserBugProgress extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column
    private Long bugId;

    @Column
    private Integer currentStep;

    @Column
    private Integer remainingLife;

    @Column
    private Boolean isCompleted;

    @Column
    private LocalDateTime lastAttemptedAt;
}
