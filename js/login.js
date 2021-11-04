var form = document.getElementById("login-form");

form.onsubmit = function (e) {
	e.preventDefault();

	var data = new FormData(form);

	var xhr = new XMLHttpRequest();
	xhr.onload = function () {
		try {
			var result = JSON.parse(this.response);
			switch (result.status) {
			case "invalid":
				alert("Invalid username or password.");
				break;
			case "success":
				console.log(document.referrer);
				window.location = document.referrer || "/";
				break;
			}
		} catch (e) { alert("Server error: " + result + " - - -  " + e); }
	};

	xhr.open("POST", "/login.php");
	xhr.send(data);
};

var bigForm = document.getElementById("big-login-form");

if (typeof bigForm !== "undefined" && bigForm !== null) {
	bigForm.onsubmit = function (e) {
		e.preventDefault();

		var data = new FormData(bigForm);

		var xhr = new XMLHttpRequest();
		xhr.onload = function () {
			try {
				var result = JSON.parse(this.response);
				switch (result.status) {
				case "invalid":
					alert("Invalid username or password.");
					break;
				case "success":
					console.log(document.referrer);
					window.location = document.referrer || "/";
					break;
				}
			} catch (e) { alert("Server error: " + result + " - - -  " + e); }
		};

		xhr.open("POST", "/login.php");
		xhr.send(data);
	};
}
