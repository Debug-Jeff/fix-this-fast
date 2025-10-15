function add(x y) {
    return x + y;
}

function subtract(x, y) 
    return x - y;
}

function multiply(x, y) {
return x * y
}

function divide(x, y) {
    if (y = 0) {
        return "Cannot divide by zero!";
    } else
        return x / y;
}

console.log("Welcome to the calculator!");
let num1 = prompt("Enter first number: ");
let num2 = prompt("Enter second number: ");

console.log("Choose operation: +, -, *, /");
let choice = prompt("Enter operation: ");

if (choice === '+') {
    console.log("Result is: " + add(num1, num2));
} else if (choice === '-') {
    console.log("Result is: " + subtract(num1, num2));
} else if (choice === '*') {
    console.log("Result is: " + multiply(num1, num2));
} else if (choice === '/') {
    console.log("Result is: " + divide(num1, num2));
} else
    console.log("Invalid operation")