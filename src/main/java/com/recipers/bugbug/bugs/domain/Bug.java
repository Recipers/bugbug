package com.recipers.bugbug.bugs.domain;

import com.recipers.bugbug.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bugs")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Bug extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private Integer baseLife;

    @Builder
    private Bug (
        Long id,
        String title,
        String description,
        Integer baseLife
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.baseLife = baseLife;
    }
}
