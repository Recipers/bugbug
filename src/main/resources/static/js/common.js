
// 사용자 드롭다운 토글
function toggleUserMenu() {
    const dropdown = document.getElementById('userDropdownMenu');
    const userDropdown = document.querySelector('.user-dropdown');

    dropdown.classList.toggle('show');
    userDropdown.classList.toggle('active');
}

// 외부 클릭 시 드롭다운 닫기
document.addEventListener('click', function(event) {
    const userDropdown = document.querySelector('.user-dropdown');
    const userDropdownMenu = document.getElementById('userDropdownMenu');

    // 사용자 드롭다운 외부 클릭 시 닫기
    if (userDropdown && userDropdownMenu && !userDropdown.contains(event.target)) {
        userDropdownMenu.classList.remove('show');
        userDropdown.classList.remove('active');
    }
});

// 현재 페이지에 맞는 네비게이션 활성화
document.addEventListener('DOMContentLoaded', function() {
    const currentPath = window.location.pathname;
    const navLinks = document.querySelectorAll('.nav-link, .mobile-nav-link');

    navLinks.forEach(link => {
        if (link.getAttribute('href') === currentPath) {
            link.classList.add('active');
        }
    });
});
