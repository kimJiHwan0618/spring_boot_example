const listPopupEl = document.querySelector(".add__popup");

const fn_popupToggle = () => {
  listPopupEl.classList.toggle("active");
};

const fn_listSubmit = (form) => {
  const listTitle = form.title.value;
  const listBody = form.body.value;

  if (listTitle === 0) {
    alert("제목을 입력해주세요");
    form.title.focus();
  } else if (listBody === 0) {
    alert("내용을 입력해주세요");
    form.body.focus();
  } else {
    $.ajax({
      url: "./doAdd",
      type: "post",
      data: {
        title: listTitle,
        body: listBody,
      },
      dataType: "text",
      success: function (data, status, xhr) {
        const listAllEl = document.querySelector("#listWrap");
        /*console.log(listTitle + '= 제목');
				console.log(listBody + '= 내용');*/
        /*console.log(listAllEl)
				listAllEl.appendChild(`h2`)*/
        console.log(JSON.parse(data));
        console.log(status);
        console.log(xhr);
        fn_popupToggle();
      },
      error: function (error) {
        console.log(error);
      },
    });
  }
};
