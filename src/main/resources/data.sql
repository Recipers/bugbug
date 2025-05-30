-- ==========================================
-- 초기 데이터 삽입 스크립트
-- ==========================================

-- 사용자 초기 데이터
INSERT INTO users (email, password_hash, nickname, social_provider, social_id, created_at,
                   updated_at)
VALUES ('admin@bugbug.com', '$2a$10$N4AX/nMqiXwf7r0iL7OQsuWW5AUhzF4S8G8Q7Y2Z1pVQ7R2A4hJxy', '관리자',
        'kakao', '1', NOW(), NOW()),
       ('user1@example.com', '$2a$10$N4AX/nMqiXwf7r0iL7OQsuWW5AUhzF4S8G8Q7Y2Z1pVQ7R2A4hJxy',
        '테스트유저1', 'naver', '2', NOW(), NOW()),
       ('user2@example.com', '$2a$10$N4AX/nMqiXwf7r0iL7OQsuWW5AUhzF4S8G8Q7Y2Z1pVQ7R2A4hJxy',
        '테스트유저2', 'google', 'google123', NOW(), NOW()),
       ('developer@example.com', '$2a$10$N4AX/nMqiXwf7r0iL7OQsuWW5AUhzF4S8G8Q7Y2Z1pVQ7R2A4hJxy',
        '개발자', 'github', 'github456', NOW(), NOW()),
       ('tester@example.com', '$2a$10$N4AX/nMqiXwf7r0iL7OQsuWW5AUhzF4S8G8Q7Y2Z1pVQ7R2A4hJxy', '테스터',
        'facebook', 'fb789', NOW(), NOW());

-- 버그 문제 초기 데이터
INSERT INTO bugs (title, description, base_life, created_at, updated_at)
VALUES ('SQL 인젝션 취약점', 'SQL 인젝션 공격을 방어하는 방법을 학습합니다. 사용자 입력을 안전하게 처리하는 것이 핵심입니다.', 3, NOW(), NOW()),
       ('XSS 취약점', 'Cross-Site Scripting 공격을 방어하는 방법을 학습합니다. 사용자 입력 검증과 출력 인코딩이 중요합니다.', 3, NOW(),
        NOW()),
       ('CSRF 취약점', 'Cross-Site Request Forgery 공격을 방어하는 방법을 학습합니다. 토큰 기반 인증이 핵심입니다.', 2, NOW(),
        NOW()),
       ('인증 우회', '잘못된 인증 로직으로 인한 보안 취약점을 학습합니다.', 2, NOW(), NOW()),
       ('권한 상승', '적절하지 않은 권한 검증으로 인한 취약점을 학습합니다.', 4, NOW(), NOW()),
       ('파일 업로드 취약점', '안전하지 않은 파일 업로드로 인한 보안 위험을 학습합니다.', 3, NOW(), NOW()),
       ('세션 관리 취약점', 'Session Hijacking과 Session Fixation 공격을 방어하는 방법을 학습합니다.', 2, NOW(), NOW());

-- 버그 정보 초기 데이터
INSERT INTO bug_info (bug_id, title, content, screen_order, created_at, updated_at)
VALUES
-- SQL 인젝션 관련
(1, 'SQL 인젝션이란?', 'SQL 인젝션은 웹 애플리케이션의 보안 취약점 중 하나로, 악의적인 SQL 코드를 삽입하여 데이터베이스를 조작하는 공격입니다.', 1,
 NOW(), NOW()),
(1, 'SQL 인젝션 예시',
 '다음과 같은 코드에서 SQL 인젝션이 발생할 수 있습니다: SELECT * FROM users WHERE id = '' + userInput + ''', 2, NOW(),
 NOW()),
(1, '안전한 쿼리 작성법', 'PreparedStatement나 매개변수화된 쿼리를 사용하여 SQL 인젝션을 방어할 수 있습니다.', 3, NOW(), NOW()),

-- XSS 관련
(2, 'XSS 공격이란?', 'XSS는 악의적인 스크립트를 웹 페이지에 삽입하여 사용자의 브라우저에서 실행시키는 공격입니다.', 1, NOW(), NOW()),
(2, 'XSS 공격 유형', 'Reflected XSS, Stored XSS, DOM-based XSS 등 다양한 유형이 있습니다.', 2, NOW(), NOW()),
(2, 'XSS 방어 방법', 'HTML 인코딩, CSP(Content Security Policy), 입력 검증 등으로 XSS를 방어할 수 있습니다.', 3, NOW(),
 NOW()),

-- CSRF 관련
(3, 'CSRF 공격이란?', 'CSRF는 사용자가 의도하지 않은 요청을 서버에 전송하도록 하는 공격입니다.', 1, NOW(), NOW()),
(3, 'CSRF 방어법', 'CSRF 토큰, SameSite 쿠키 설정 등으로 방어할 수 있습니다.', 2, NOW(), NOW()),

-- 인증 우회 관련
(4, '인증 우회란?', '잘못된 인증 로직을 통해 권한 없는 사용자가 시스템에 접근하는 것을 말합니다.', 1, NOW(), NOW()),
(4, '인증 우회 방어법', '강력한 인증 메커니즘과 세션 관리로 인증 우회를 방어할 수 있습니다.', 2, NOW(), NOW()),

-- 권한 상승 관련
(5, '권한 상승이란?', '낮은 권한의 사용자가 높은 권한으로 접근하는 공격입니다.', 1, NOW(), NOW()),
(5, '권한 검증 방법', '적절한 권한 검증과 역할 기반 접근 제어(RBAC)를 통해 방어할 수 있습니다.', 2, NOW(), NOW());

-- 버그 단계 초기 데이터
INSERT INTO bug_steps (bug_id, step_number, created_at, updated_at)
VALUES
-- SQL 인젝션 단계
(1, 1, NOW(), NOW()),
(1, 2, NOW(), NOW()),
(1, 3, NOW(), NOW()),
-- XSS 단계
(2, 1, NOW(), NOW()),
(2, 2, NOW(), NOW()),
(2, 3, NOW(), NOW()),
-- CSRF 단계
(3, 1, NOW(), NOW()),
(3, 2, NOW(), NOW()),
-- 인증 우회 단계
(4, 1, NOW(), NOW()),
(4, 2, NOW(), NOW()),
-- 권한 상승 단계
(5, 1, NOW(), NOW()),
(5, 2, NOW(), NOW()),
(5, 3, NOW(), NOW()),
-- 파일 업로드 단계
(6, 1, NOW(), NOW()),
(6, 2, NOW(), NOW()),
-- 세션 관리 단계
(7, 1, NOW(), NOW()),
(7, 2, NOW(), NOW());

-- 버그 선택지 초기 데이터
INSERT INTO bug_choices (step_id, title, is_correct, created_at, updated_at)
VALUES
-- SQL 인젝션 1단계 (step_id = 1)
(1, 'PreparedStatement를 사용한다', true, NOW(), NOW()),
(1, '사용자 입력을 그대로 쿼리에 연결한다', false, NOW(), NOW()),
(1, '입력값을 HTML 인코딩한다', false, NOW(), NOW()),
(1, 'SQL 주석을 제거한다', false, NOW(), NOW()),

-- SQL 인젝션 2단계 (step_id = 2)
(2, 'String.format()으로 쿼리를 생성한다', false, NOW(), NOW()),
(2, '매개변수화된 쿼리를 사용한다', true, NOW(), NOW()),
(2, '사용자 입력에서 특수문자를 제거한다', false, NOW(), NOW()),
(2, '쿼리를 암호화한다', false, NOW(), NOW()),

-- SQL 인젝션 3단계 (step_id = 3)
(3, 'WHERE 절에 OR 1=1을 추가한다', false, NOW(), NOW()),
(3, '입력값 검증과 이스케이프 처리를 한다', true, NOW(), NOW()),
(3, '데이터베이스 권한을 높인다', false, NOW(), NOW()),
(3, 'SQL 로그를 비활성화한다', false, NOW(), NOW()),

-- XSS 1단계 (step_id = 4)
(4, 'HTML 태그를 이스케이프한다', true, NOW(), NOW()),
(4, '사용자 입력을 그대로 출력한다', false, NOW(), NOW()),
(4, 'JavaScript를 비활성화한다', false, NOW(), NOW()),
(4, 'CSS 스타일을 제거한다', false, NOW(), NOW()),

-- XSS 2단계 (step_id = 5)
(5, 'document.write()를 사용한다', false, NOW(), NOW()),
(5, 'innerHTML에 직접 할당한다', false, NOW(), NOW()),
(5, 'textContent를 사용한다', true, NOW(), NOW()),
(5, 'eval() 함수를 사용한다', false, NOW(), NOW()),

-- XSS 3단계 (step_id = 6)
(6, 'Content-Security-Policy 헤더를 설정한다', true, NOW(), NOW()),
(6, '모든 스크립트를 허용한다', false, NOW(), NOW()),
(6, 'HTTP Only 쿠키만 사용한다', false, NOW(), NOW()),
(6, 'HTTPS를 비활성화한다', false, NOW(), NOW()),

-- CSRF 1단계 (step_id = 7)
(7, 'CSRF 토큰을 사용한다', true, NOW(), NOW()),
(7, 'GET 요청으로 중요한 작업을 처리한다', false, NOW(), NOW()),
(7, '모든 요청을 허용한다', false, NOW(), NOW()),
(7, 'Referer 헤더만 검증한다', false, NOW(), NOW()),

-- CSRF 2단계 (step_id = 8)
(8, 'SameSite=None으로 설정한다', false, NOW(), NOW()),
(8, 'SameSite=Strict로 설정한다', true, NOW(), NOW()),
(8, '쿠키를 사용하지 않는다', false, NOW(), NOW()),
(8, 'CORS를 모든 도메인에 허용한다', false, NOW(), NOW()),

-- 인증 우회 1단계 (step_id = 9)
(9, '강력한 패스워드 정책을 적용한다', true, NOW(), NOW()),
(9, '패스워드 없이 로그인을 허용한다', false, NOW(), NOW()),
(9, '모든 사용자에게 동일한 권한을 부여한다', false, NOW(), NOW()),

-- 인증 우회 2단계 (step_id = 10)
(10, '2단계 인증(2FA)을 사용한다', true, NOW(), NOW()),
(10, '쿠키에 패스워드를 저장한다', false, NOW(), NOW()),
(10, 'HTTP로 로그인 정보를 전송한다', false, NOW(), NOW()),

-- 권한 상승 1단계 (step_id = 11)
(11, '최소 권한 원칙을 적용한다', true, NOW(), NOW()),
(11, '모든 사용자에게 관리자 권한을 준다', false, NOW(), NOW()),
(11, '권한 검증을 생략한다', false, NOW(), NOW()),

-- 권한 상승 2단계 (step_id = 12)
(12, '역할 기반 접근 제어(RBAC)를 사용한다', true, NOW(), NOW()),
(12, 'URL에 권한 정보를 포함한다', false, NOW(), NOW()),
(12, '클라이언트 측에서만 권한을 검증한다', false, NOW(), NOW()),

-- 권한 상승 3단계 (step_id = 13)
(13, '서버 측에서 권한을 검증한다', true, NOW(), NOW()),
(13, '사용자 입력을 신뢰한다', false, NOW(), NOW()),
(13, '디폴트로 모든 권한을 허용한다', false, NOW(), NOW());

-- 사용자 진행 상황 초기 데이터 (테스트용)
INSERT INTO user_bug_progress (user_id, bug_id, current_step, remaining_life, is_completed,
                               last_attempted_at, created_at, updated_at)
VALUES (2, 1, 1, 3, false, NOW(), NOW(), NOW()),
       (2, 2, 2, 2, false, NOW(), NOW(), NOW()),
       (3, 1, 3, 1, true, DATE_SUB(NOW(), INTERVAL 1 DAY), NOW(), NOW()),
       (3, 2, 1, 3, false, NOW(), NOW(), NOW()),
       (4, 1, 2, 2, false, DATE_SUB(NOW(), INTERVAL 2 HOUR), NOW(), NOW()),
       (5, 3, 1, 2, false, NOW(), NOW(), NOW()),
       (5, 4, 2, 1, false, DATE_SUB(NOW(), INTERVAL 30 MINUTE), NOW(), NOW());

-- 사용자 답변 초기 데이터 (테스트용)
INSERT INTO user_bug_step_answers (progress_id, step_id, choice_id, is_correct, answered_at,
                                   created_at, updated_at)
VALUES
-- user2의 SQL 인젝션 진행 (progress_id = 1)
(1, 1, 1, true, DATE_SUB(NOW(), INTERVAL 5 MINUTE), NOW(), NOW()),

-- user2의 XSS 진행 (progress_id = 2)
(2, 4, 4, true, DATE_SUB(NOW(), INTERVAL 10 MINUTE), NOW(), NOW()),
(2, 5, 7, true, DATE_SUB(NOW(), INTERVAL 8 MINUTE), NOW(), NOW()),

-- user3의 완료된 SQL 인젝션 (progress_id = 3)
(3, 1, 1, true, DATE_SUB(NOW(), INTERVAL 1 DAY), NOW(), NOW()),
(3, 2, 6, true, DATE_SUB(NOW(), INTERVAL 1 DAY), NOW(), NOW()),
(3, 3, 10, true, DATE_SUB(NOW(), INTERVAL 1 DAY), NOW(), NOW()),

-- user3의 XSS 진행 (progress_id = 4)
(4, 4, 4, true, DATE_SUB(NOW(), INTERVAL 3 HOUR), NOW(), NOW()),

-- user4의 SQL 인젝션 진행 (progress_id = 5)
(5, 1, 1, true, DATE_SUB(NOW(), INTERVAL 2 HOUR), NOW(), NOW()),
(5, 2, 5, false, DATE_SUB(NOW(), INTERVAL 1 HOUR), NOW(), NOW()),

-- user5의 CSRF 진행 (progress_id = 6)
(6, 7, 7, true, DATE_SUB(NOW(), INTERVAL 15 MINUTE), NOW(), NOW()),

-- user5의 인증 우회 진행 (progress_id = 7)
(7, 9, 9, true, DATE_SUB(NOW(), INTERVAL 45 MINUTE), NOW(), NOW()),
(7, 10, 12, false, DATE_SUB(NOW(), INTERVAL 30 MINUTE), NOW(), NOW());
