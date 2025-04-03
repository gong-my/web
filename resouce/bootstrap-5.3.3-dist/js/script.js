function toggleLike(productId) {
  // 하트 아이콘을 찾기
  var heartIcon = document.getElementById("heart-icon-" + productId);

  // 모달 객체 가져오기
  var myModal = new bootstrap.Modal(document.getElementById("likeModal"));
  var modalTitle = document.getElementById("likeModalLabel");
  var modalBody = document.getElementById("modal-body");

  // 하트 색상 변경: 빈 하트 -> 채워진 하트 또는 그 반대
  if (heartIcon.classList.contains("ri-heart-line")) {
    heartIcon.classList.remove("ri-heart-line"); // 빈 하트
    heartIcon.classList.add("ri-heart-fill"); // 채워진 하트

    // 모달 내용 설정
    modalTitle.innerText = "좋아요 추가";
    modalBody.innerText = "상품이 좋아요에 추가되었습니다!";
  } else {
    heartIcon.classList.remove("ri-heart-fill"); // 채워진 하트
    heartIcon.classList.add("ri-heart-line"); // 빈 하트

    // 모달 내용 설정
    modalTitle.innerText = "좋아요 취소";
    modalBody.innerText = "상품의 좋아요가 취소되었습니다!";
  }

  // 모달 표시
  myModal.show();
}
$(function () {
  // 메뉴 열기 버튼 클릭 시 메뉴 표시
  $(".nav-pop").click(function () {
    $(".nav__wrapper").addClass("active"); // 메뉴 열기
  });

  // 메뉴 닫기 버튼 클릭 시 메뉴 숨기기
  $(".button--nav-close").click(function () {
    $(".nav__wrapper").removeClass("active"); // 메뉴 닫기
  });
});
