function workingConditions() {
    /**
 * 3 variables defined with no values.
 * Values will be assigned later
 */

let temperature;
let condition;
let goToWork;

temperature = prompt("What is the value of the temperature today?");

/**
 * Anticipated variables are:
 * a. Sunny
 * b. Cloudy
 * c. Raining
 * d. Snowing
 * e. Thunder
 * Stored into a const variable as an array. This is so we can iterate
 * through the object.
 */

const acceptedConditions = ["sunny", "cloudy", "raining", "snowing", "thunder"];


/**
 * I would improve the above further, by adding a validation.
 * IF the user did not not input accepted conditions, it will
 * prompt the user to input the correct ones.
 */


//asks users what the condition is and shows what the accepted weather conditions are
condition =
  prompt(`What is the weather condition today? Please bear in mind, we 
only accept the below weather conditions ${acceptedConditions}`);

switch (condition) {
    case 'sunny':
    case 'cloudy':
        if (temperature >= 10 && temperature < 30) {
            goToWork = true;
        } else {
            goToWork = false;
        }
    break;
    /**
     * if the temperature is above 20 & less than 29 go to work
     * if the temperature is 10+ and less than 20, above, 30, below 10 DO NOT
     */
    case 'raining':
        if (temperature >= 20 && temperature < 30 && !temperature < 10) {
            goToWork = true;
        } else {
            goToWork = false;
        }
    break;
    // if weather condition is snowing & thunder, do not go to work
    case 'snowing':
    case 'thunder':
        goToWork = false;
    break;
    
    default:
        prompt('Uh oh, something went wrong. Please try again.');
}

/**
 * Using ternary operator to display to user whether it is safe or not 
 * safe to go to work.
 */
const outcome = goToWork ? 'safe to work' : 'not safe to work';

// using return statement
return `Kelvin has decided your fate today: ${outcome}`;
}

alert(workingConditions());