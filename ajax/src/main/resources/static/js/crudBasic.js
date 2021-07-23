const listPopupEl = document.querySelector(".list__popup");
const listFormEl = document.querySelector("#listForm");
const popupBtnEl = document.querySelector("#popupBtnEl");
const modifyList = {
  id: Number,
  element: "",
};
const clearFormInput = () => {
  listFormEl.children[0].value = "";
  listFormEl.children[1].value = "";
};

const fn_popupToggle = (evt) => {
  evt === "addBtn" && clearFormInput();
  listFormEl.children[1].value.length > 0
    ? (popupBtnEl.value = "수정")
    : (popupBtnEl.value = "추가");
  listPopupEl.classList.toggle("active");
};

/* 리스트 삭제 */
const fn_listDelete = (btnEl) => {
  const listEl = btnEl.parentNode.parentNode;
  const listId = parseInt(listEl.children[0].children[0].children[1].innerText);

  if (confirm(`ID : ${listId}번 리스트를 삭제하시겠습니까?`)) {
    ajaxListDelete(listId, listEl);
  } else {
    console.log("nono~");
  }
};
/* 리스트 삭제 */

/* 리스트 수정 */
const fn_listModify = (btnEl) => {
  const listEl = btnEl.parentNode.parentNode;
  const listId = parseInt(listEl.children[0].children[0].children[1].innerText);
  const listTitle = listEl.children[1].children[0].innerText;
  const listBody = listEl.children[1].children[1].innerText;

  listFormEl.children[0].value = listTitle;
  listFormEl.children[1].value = listBody;
  fn_popupToggle();
  modifyList.id = listId;
  modifyList.element = listEl;
};
/* 리스트 수정 */

/* 리스트 추가 */
const fn_listSubmit = (form) => {
  const listTitle = form.title.value;
  const listBody = form.body.value;
  if (form.button.value === "추가") {
    if (listTitle.length === 0) {
      alert("제목을 입력해주세요");
      form.title.focus();
    } else if (listBody.length === 0) {
      alert("내용을 입력해주세요");
      form.body.focus();
    } else {
      ajaxListAdd(listTitle, listBody);
      fn_popupToggle();
      clearFormInput();
    }
  } else if (form.button.value === "수정") {
    if (listTitle.length === 0) {
      alert("제목을 입력해주세요");
      form.title.focus();
    } else if (listBody.length === 0) {
      alert("내용을 입력해주세요");
      form.body.focus();
    } else {
      ajaxListModify(listTitle, listBody, modifyList.id, modifyList.element);
      fn_popupToggle();
      clearFormInput();
    }
  }
};
/* 리스트 추가 */
