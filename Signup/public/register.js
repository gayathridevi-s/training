const form = document.querySelector('#form');
const username = document.querySelector('#username');
const email = document.querySelector('#email');
const password = document.querySelector('#password');
const cpassword = document.querySelector('#cpassword');

username.addEventListener('input', () => {
  validateUsername();
});

email.addEventListener('input', () => {
  validateEmail();
});

password.addEventListener('input', () => {
  validatePassword();
});

cpassword.addEventListener('input', () => {
  validateConfirmPassword();
});

function setError(element, message) {
  const inputGroup = element.parentElement;
  const errorElement = inputGroup.querySelector('.error');
  errorElement.innerText = message;
  inputGroup.classList.add('error');
  inputGroup.classList.remove('success');
}

function setSuccess(element) {
  const inputGroup = element.parentElement;
  const errorElement = inputGroup.querySelector('.error');
  errorElement.innerText = '';
  inputGroup.classList.add('success');
  inputGroup.classList.remove('error');
}

const isValidEmail = email => {
  const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  return re.test(String(email).toLowerCase());
};

const validateUsername = () => {
  const usernameValue = username.value.trim();
  
  if (usernameValue === '') {
    setError(username, 'Username is required');
  } else {
    setSuccess(username);
  }
};

const validateEmail = () => {
  const emailValue = email.value.trim();
  const isValid = isValidEmail(emailValue);

  if (emailValue === '') {
    setError(email, 'Email is required');
  } else if (!isValid) {
    setError(email, 'Provide a valid email address');
  } else {
    setSuccess(email);
  }
};

const validatePassword = () => {
  const passwordValue = password.value.trim();

  if (passwordValue === '') {
    setError(password, 'Password is required');
  } else if (passwordValue.length < 8) {
    setError(password, 'Password must contain at least 8 characters');
  } else {
    setSuccess(password);
  }
};

const validateConfirmPassword = () => {
  const cpasswordValue = cpassword.value.trim();
  const passwordValue = password.value.trim();

  if (cpasswordValue === '') {
    setError(cpassword, 'Please confirm your password');
  } else if (cpasswordValue !== passwordValue) {
    setError(cpassword, 'Passwords do not match');
  } else {
    setSuccess(cpassword);
  }
};

form.addEventListener('submit', e => {
  e.preventDefault();
  validateUsername();
  validateEmail();
  validatePassword();
  validateConfirmPassword();
});
