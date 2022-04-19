//define 2 values and store user values into variables:

let firstValue = Number(prompt('Please enter your first value:'));
let secondValue = Number(prompt('Please enter your second value:'));

//converting data into a number - parseInt was causing First Value to be undefined.
//firstValue = parseInt(firstValue);
//secondValue = parseInt(secondValue);

//Informing users what an accepted condition is 
let acceptedConditions = ['+', '-','/', '*', '^'];
let operation = prompt(`What operation would you like to perform on the two values? 
    Accepted operations are ${acceptedConditions}`);

// Function for addition
function addition(firstValue, secondValue) {
    return firstValue + secondValue ;
}

// Funtion for subtraction
function subtraction(firstValue, secondValue) {
    return firstValue - secondValue;
}

// Function for division
function division(firstValue, secondValue) {
   return firstValue / secondValue;
}

// Function for multiplication
function multiplication(firstValue, secondValue) {
    return firstValue * secondValue;
}

// Function for power to
function powerTo(firstValue, secondValue) {
    return firstValue ^ secondValue;
}

//declared finalValue - this will be the calculated result
let finalValue;

//Using switch to determine what operation user would like to use:
switch(operation) {
    case "+" :
        finalValue = addition(firstValue, secondValue);
        break;
    case "-":
        finalValue = subtraction(firstValue, secondValue);
        break;
    case "/":
        finalValue = division(firstValue, secondValue);
        break;
    case "*":
        finalValue = multiplication(firstValue, secondValue);
        break;
    case "^":
        finalValue = powerTo(firstValue, secondValue);
        break;
    default:
        console.log("Uh oh, you did not input an operation. Try again!");
        break;
}

//Calling the functions
addition();
subtraction();
division();
multiplication();
powerTo();

//Logging the output onto the console. Would like look nicer if logged into HTML element
console.log(`${firstValue} ${operation} ${secondValue} = ${finalValue}`)

