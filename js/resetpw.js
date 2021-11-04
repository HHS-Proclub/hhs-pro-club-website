var form = document.getElementById("reset-form");

form.onsubmit = function (e) {
	e.preventDefault();

	var data = new FormData(form);

	var xhr = new XMLHttpRequest();
	xhr.onload = function () {
		try {
			var result = JSON.parse(this.response);
			switch (result.status) {
			case "notempty":
			  alert("Password cannot be empty!");
				break;
			case "donotmatch":
				alert("Passwords do not match!");
				break;
			case "success":
			  alert("Your password has been successfully reset!");
				window.location.href = "/";
			}
		} catch (e) {
			alert("Server error: " + result + " - - -  " + e);
			window.location.href = "/";
		}
	};

	xhr.open("POST", "/resetpw.php");
	xhr.send(data);
};

let passwordCheck = document.getElementById("reset-password2");
passwordCheck.onblur = function() {
	passwordCheck.setCustomValidity(form.elements["reset-password1"].value === this.value ? "" : "Passwords must match");
}

window.onload = function() {
	const urlParams = new URLSearchParams(window.location.search);
	document.getElementById("reset-token").value = urlParams.get("reset-token");
};
