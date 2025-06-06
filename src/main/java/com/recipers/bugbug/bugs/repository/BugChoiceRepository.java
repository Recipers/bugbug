package com.recipers.bugbug.bugs.repository;

import com.recipers.bugbug.bugs.domain.BugChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugChoiceRepository extends JpaRepository<BugChoice, Long> {
}