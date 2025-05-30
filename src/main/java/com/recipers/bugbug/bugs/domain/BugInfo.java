package com.recipers.bugbug.bugs.domain;


import com.recipers.bugbug.bugs.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bug_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BugInfo extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long bugId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Integer screenOrder;
}
