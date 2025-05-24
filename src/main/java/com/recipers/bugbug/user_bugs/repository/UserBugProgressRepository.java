package com.recipers.bugbug.user_bugs.repository;

import com.recipers.bugbug.user_bugs.domain.UserBugProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBugProgressRepository extends JpaRepository<UserBugProgress, Long> {
}