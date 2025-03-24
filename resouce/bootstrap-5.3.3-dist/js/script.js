function toggleLike(productId) {
  // 좋아요 카운트 업데이트
  var likeCount = document.getElementById("like-count-" + productId);
  var likeText = document.getElementById("like-text-" + productId);

  var count = parseInt(likeCount.innerText);

  // "좋아요" 상태 변경
  if (likeText.innerText === "좋아요") {
    likeText.innerText = alert("취소 하였습니다");
    count++;
  } else {
    likeText.innerText = alert("좋아요 추가 하였습니다");
    count--;
  }

  likeCount.innerText = count;

  // 모달 띄우기
  var myModal = new bootstrap.Modal(document.getElementById("likeModal"));
  myModal.show();
}
