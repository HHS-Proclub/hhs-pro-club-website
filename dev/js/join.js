var form = document.getElementById("join-form");
var passwordCheck = document.getElementById("password-check");

passwordCheck.onblur = function () {
	passwordCheck.setCustomValidity(form.elements["password"].value === this.value ?
		"" : "Passwords must match");
};

form.onsubmit = function (e) {
	e.preventDefault();

	var data = new FormData(form);

	var xhr = new XMLHttpRequest();
	xhr.onload = function () {
		try {
			var result = JSON.parse(this.response);
			switch (result.status) {
			case "email":
				alert("Sorry, an account with this email already exists.");
				break;
			case "username":
				alert("Sorry, this username has already been taken");
				break;
			case "success":
				window.location = document.referrer || "/";
				break;
			}
		} catch (e) { alert("Server error"); }
	};

	xhr.open("POST", "");
	xhr.send(data);
};
