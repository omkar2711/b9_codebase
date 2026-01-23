function colorChange(){
    console.log("Button Clicked");
    let HeaderElement = document.getElementById('Header-text');
    HeaderElement.innerText = "Welcome to our Restaurant website";
    HeaderElement.style.color = "red";
}


function calculateSum(){
    console.log("Calculating Sum");
    event.preventDefault(); // Prevent form submission
    let num1 = parseFloat(document.getElementById('number1').value);
    let num2 = parseFloat(document.getElementById('number2').value);
    if (isNaN(num1) || isNaN(num2)) {
        alert("Please enter valid numbers");
        return;
    }
    let sum = num1 + num2;
    let resultElement = document.getElementById('result');
    resultElement.innerText = "The sum is: " + sum;
}