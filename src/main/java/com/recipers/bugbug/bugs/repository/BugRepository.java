package com.recipers.bugbug.bugs.repository;

import com.recipers.bugbug.bugs.domain.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long> {
}