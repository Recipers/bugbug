package com.recipers.bugbug.bugs.repository;

import com.recipers.bugbug.bugs.domain.Bug;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long> {

    /**
     * ID 순으로 정렬된 모든 Bug 조회 (페이징)
     */
    Page<Bug> findAllByOrderByIdAsc(Pageable pageable);

    /**
     * 제목으로 검색하되 ID 순으로 정렬 (페이징)
     */
    Page<Bug> findByTitleContainingIgnoreCaseOrderByIdAsc(String title, Pageable pageable);

    /**
     * 제목 또는 설명으로 검색하되 ID 순으로 정렬 (페이징)
     */
    Page<Bug> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrderByIdAsc(
        String title, String description, Pageable pageable);
}
