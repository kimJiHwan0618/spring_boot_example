const listAllEl = document.querySelector("#listWrap");
const listLengthText = document.querySelector("#listLength");

const ajaxListAdd = (title, body) => {
  $.ajax({
    url: "/doAdd",
    type: "post",
    data: {
      title: title,
      body: body,
    },
    dataType: "text",
    success: function (data, status, xhr) {
      console.log(data);
      const updateListArr = JSON.parse(data);
      const addList = updateListArr[updateListArr.length - 1];

      const fn_createListEl = () => {
        const el1 = document.createElement("div");
        const el2 = document.createElement("div");
        const el3 = document.createElement("dl");
        const el4 = document.createElement("dt");
        const el5 = document.createElement("dd");
        const el6 = document.createElement("p");
        const el7 = document.createElement("dl");
        const el8 = document.createElement("dt");
        const el9 = document.createElement("dd");
        const el10 = document.createElement("div");
        const el11 = document.createElement("button");
        const el12 = document.createElement("button");
        el4.innerText = "아이디:";
        el5.innerText = addList.id;
        el6.innerText = addList.regDate;
        el8.innerText = addList.title;
        el9.innerText = addList.body;
        el11.innerText = "삭제";
        el12.innerText = "수정";
        el1.className = "list";
        el2.className = "list__top";
        el5.className = "f__midium";
        el6.className = "f__midium";
        el8.className = "f__midium";
        el9.className = "content";
        el10.className = "button__wrap";
        el11.className = "f__midium";
        el12.className = "f__midium";
        el1.appendChild(el2);
        el1.appendChild(el7);
        el1.appendChild(el10);
        el2.appendChild(el3);
        el2.appendChild(el6);
        el3.appendChild(el4);
        el3.appendChild(el5);
        el7.appendChild(el8);
        el7.appendChild(el9);
        el10.appendChild(el11);
        el10.appendChild(el12);
        el11.onclick = () => {
          fn_listDelete(el11);
        };
        el12.onclick = () => {
          fn_listModify(el12);
        };
        return el1;
      };

      listAllEl.appendChild(fn_createListEl());
      listLengthText.innerText = listAllEl.children.length;
    },
    error: function (error) {
      console.log(error);
    },
  });
};

const ajaxListDelete = (listId, listEl) => {
  $.ajax({
    url: `/doDelete`,
    type: "post",
    data: {
      id: listId,
    },
    success: function (data, status, xhr) {
      listEl.remove();
      listLengthText.innerText = listAllEl.children.length;
    },
    error: function (error) {
      console.log(error);
    },
  });
};

const ajaxListModify = (listTitle, listBody, listId, listEl) => {
  $.ajax({
    url: `/doModify`,
    type: "post",
    data: {
      title: listTitle,
      body: listBody,
      id: listId,
    },
    success: function (data, status, xhr) {
      console.log(data);
      listEl.children[1].children[0].innerText = data.title;
      listEl.children[1].children[1].innerText = data.body;
      listEl.children[0].children[1].innerText = data.regDate;
    },
    error: function (error) {
      console.log(error);
    },
  });
};
