let userName = "admin";
let password = "admin123";


let inputValue = document.getElementById('username');
inputValue.addEventListener('input', function(e){
    console.log("Username Input Changed: " + e.target.value);
});


let para = document.getElementById('paragraph');
let btn = document.getElementById('changePara');
let resultDiv = document.getElementById('result-div');
btn.addEventListener('mouseover', function(){
    para.innerText = "Paragraph text has been changed!";
    para.style.color = "blue";
    console.log("Paragraph changed");
    resultDiv.innerHTML +="<p>Paragraph was changed on mouseover event.</p>";
    //change the cursor to pointer
    btn.style.cursor = "pointer";
});


function login(){
    let userNameInput = document.getElementById('username').value;
    let passwordInput = document.getElementById('password').value;
    let loginMessage = document.getElementById('loginResult');

    if(userNameInput === userName && passwordInput === password){
        loginMessage.innerText = "Login Successful!";
        loginMessage.style.color = "green";
        console.log("User logged in");
    } else {
        loginMessage.innerText = "Invalid Credentials";
        loginMessage.style.color = "red";
        console.log("Login failed");
    }
}


let sec = 0;
let min = 0;
let hr = 0;
setInterval(function(){
    if(sec < 60){
        sec++;
    }
    if(sec == 60){
        sec = 0;
        min++;
    }
    if(min == 60){
        min = 0;
        hr++;
    }
    if(hr == 24){
        hr = 0;
    }
    document.getElementById('sec').innerText = sec;
    document.getElementById('min').innerText = min;
    document.getElementById('hr').innerText = hr;
}, 1000)