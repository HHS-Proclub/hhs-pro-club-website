var form = document.getElementById("forgot-form");

form.onsubmit = function (e) {
	e.preventDefault();

	var data = new FormData(form);

	var xhr = new XMLHttpRequest();
	xhr.onload = function () {
		try {
			var result = JSON.parse(this.response);
			switch (result.status) {
			case "invalid":
				alert("No user was found with the specified username and email.");
				break;
			case "captcha":
			  alert("The captcha is invalid (try refreshing the page).");
				break;
			case "success":
				alert("An email containing password reset instructions has been sent. It may take a few minutes to arrive. Make sure to check your spam folder!");
				break;
			}
		} catch (e) { alert("Server error: " + result + " - - -  " + e); }
		grecaptcha.reset();
	};

	xhr.open("POST", "/forgotpw.php");
	xhr.send(data);
};
