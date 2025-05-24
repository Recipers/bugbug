package com.recipers.bugbug.bugs.repository;

import com.recipers.bugbug.bugs.domain.BugInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugInfoRepository extends JpaRepository<BugInfo, Long> {
}