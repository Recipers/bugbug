package com.recipers.bugbug.bugs.dto.response;

import com.recipers.bugbug.bugs.domain.Bug;
import lombok.Builder;

@Builder
public record BugListResponseDto(
    Long id,
    String title,
    Boolean solved
) {

    /**
     * 팩토리 메서드: Bug 엔티티로부터 생성
     */
    public static BugListResponseDto from(Bug bug, boolean solved) {
        return new BugListResponseDto(
            bug.getId(),
            bug.getTitle(),
            solved
        );
    }

    /**
     * 표시용 상태 텍스트
     */
    public String getStatusText() {
        return solved ? "완료" : "미완료";
    }

    /**
     * CSS 클래스명
     */
    public String getStatusClass() {
        return solved ? "status-solved" : "status-unsolved";
    }
}
