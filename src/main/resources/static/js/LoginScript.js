const usernameInput = document.getElementById('username');
const passwordInput = document.getElementById('password');
const loginBtn = document.getElementById('login-btn');
const usernameError = document.getElementById('username-error');
const passwordError = document.getElementById('password-error');

loginBtn.addEventListener('click', (e) => {
    e.preventDefault();

    // Reset errors
    usernameError.innerText = '';
    passwordError.innerText = '';

    // Validate username
    if (usernameInput.value === '') {
        usernameError.innerText = 'Please enter a username';
        return;
    }

    // Validate password
    if (passwordInput.value === '') {
        passwordError.innerText = 'Please enter a password';
        return;
    }

    // If all validations pass, submit the form
    document.querySelector('form').submit();
});