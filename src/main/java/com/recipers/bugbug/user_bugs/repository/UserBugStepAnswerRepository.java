package com.recipers.bugbug.user_bugs.repository;

import com.recipers.bugbug.user_bugs.domain.UserBugStepAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBugStepAnswerRepository extends JpaRepository<UserBugStepAnswer, Long> {
}