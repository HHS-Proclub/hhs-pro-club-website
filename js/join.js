var form = document.getElementById("join-form");
var passwordCheck = document.getElementById("password-check");
var email = document.getElementById("email");

passwordCheck.onblur = function () {
	passwordCheck.setCustomValidity(form.elements["password"].value === this.value ?
		"" : "Passwords must match");
};

email.onblur = function () {
	email.setCustomValidity(!this.value.endsWith(".ru") ?
		"" : "Invalid Email");
};

form.onsubmit = function (e) {
	e.preventDefault();

	var data = new FormData(form);

	var xhr = new XMLHttpRequest();
	xhr.onload = function () {
		try {
			var xhrResp = this.response;
			var result = JSON.parse(xhrResp);
			switch (result.status) {
			case "email":
				alert("Sorry, an account with this email already exists.");
				break;
			case "username":
				alert("Sorry, this username has already been taken.");
				break;
			case "captcha":
			  alert("Sorry, the captcha is invalid (try refreshing the page).");
				break;
			case "success":
				window.location = "/success.php";
				break;
			}
		} catch (e) {
			alert("Server error");
			console.log(e);
			console.log(xhrResp);
		}
		grecaptcha.reset();
	};

	xhr.open("POST", "");
	xhr.send(data);
};
