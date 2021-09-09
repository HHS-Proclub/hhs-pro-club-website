var successGreen = 'rgba(29, 205, 112, 0.9)';
var errorRed = 'rgba(228, 70, 70, 0.9)';
var submitHoverColor = '#335b50';

var emailInput = document.getElementById('email');
var submitBtn = document.getElementById('submit-btn');
var emailForm = document.getElementById('emailForm');

emailForm.addEventListener('submit', process);

function process(e) {
    e.preventDefault();
    
    submitBtn.style.background = 'rgba(0, 0, 0, 0.9)';
    submitBtn.style.color = submitHoverColor;
    setTimeout(function() {
        submitBtn.style.background = 'rgba(70, 70, 70, 0.9)';
        submitBtn.style.color = '#fff';
    }, 100);

    if (emailInput.value) {
        var data = new FormData(emailForm);
        var xhr = new XMLHttpRequest();
        xhr.addEventListener('load', success);
        xhr.addEventListener('error', error);
        xhr.open('POST', '');
        xhr.send(data);
    }
}

function success() {
    setEmailInputStyle('Added!', successGreen);
}

function error() {
    setEmailInputStyle('Error!', errorRed);
}

function setEmailInputStyle(val, bg) {
    emailInput.value = val;
    emailInput.style.background = bg;
    emailInput.style.color = '#fff';
    setTimeout(function() {
        emailInput.value = '';
        emailInput.style.background = 'rgba(255, 255, 255, 0.9)';
        emailInput.style.color = '#222';
    }, 1000);
}
