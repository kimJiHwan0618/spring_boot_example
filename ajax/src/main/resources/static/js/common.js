const listPopupEl = document.querySelector('.add__popup')

const fn_popupToggle = () => {
	listPopupEl.classList.toggle('active')
}

const fn_listSubmit = (form) => {
	console.log(form.title.value);
	console.log(form.body.value);

	if (form.title.value.length === 0) {
		alert("제목을 입력해주세요");
		form.title.focus();
	} else if (form.body.value.length === 0) {
		alert("내용을 입력해주세요");
		form.body.focus();
	} else {
		$.ajax({
			url: './doAdd',
			type: 'post',
			data: {
				title: form.title.value,
				body: form.body.value,
			},
			dataType: 'text',
			success: function(result) {
				console.log(result)
				fn_popupToggle()
			},
			error: function(error) {
				console.log('실패' + error)
			}
		});
	}
}