package com.recipers.bugbug.users.domain;

import com.recipers.bugbug.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String passwordHash;

    @Column
    private String nickname;

    @Column
    private String socialProvider;

    @Column
    private String socialId;
}
