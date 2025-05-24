package com.recipers.bugbug.bugs.repository;

import com.recipers.bugbug.bugs.domain.BugStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugStepRepository extends JpaRepository<BugStep, Long> {
}