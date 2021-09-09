function unlockBonus() {
	if (document.getElementById("bonus-button") == null) return;  // No bonus for this problem
	let bonusButton = document.getElementById("bonus-button");
	bonusButton.className = "";
	// Make bonus tests checkbox visible
	document.getElementById("run-bonus-group").style.display = "block";
}

function toggleBonus() {
	let bonusButton = document.getElementById("bonus-button");
	let bonusContainer = document.getElementById("bonus-container");
	
	if (bonusButton.className == "link-disabled") {
		alert("Solve the main problem before viewing the bonus!");
		return;
	}

	if (bonusContainer.style.display === "none") {
		bonusButton.innerText = "Hide Bonus";
		bonusContainer.style.display = "block";
		// Check the bonus tests checkbox
		document.getElementById("run-bonus").checked = true;
	} else {
		bonusButton.innerText = "Show Bonus";
		bonusContainer.style.display = "none";
	}
}

function toggleHints() {
	let hintButton = document.getElementById("hint-button");
	let hintContainer = document.getElementById("hint-container");
	if (hintContainer.style.display === "none") {
		if (!window.confirm("Are you sure you want to view the hints?")) return;	
		hintButton.innerText = "Hide Hints";
		hintContainer.style.display = "block";
		// Record that hints were used
		recordMetadata("hint-used");
	} else {
		hintButton.innerText = "Show Hints";
		hintContainer.style.display = "none";
	}
}

function recordMetadata(metadata) {
	if (document.getElementById("input-user") == null) return;  // Not logged in
	
	// Setup AJAX request
	let xhr = new XMLHttpRequest();
	xhr.open("POST", "/webhook-metadata", true);
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	let username = document.getElementById("input-user").value;
	let problem_id = document.getElementById("input-problem").value;
	// Send request with metadata / needed info
	xhr.send(`username=${username}&problem_id=${problem_id}&metadata=${metadata}`);
}

function showSubmitStatus() {
	// Display status at top of page
	document.getElementById("submission-result-box").style.display = "block";
	resetStatusBox();
	runInterval();
}
