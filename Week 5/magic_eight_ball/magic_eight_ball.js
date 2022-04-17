//empty string stored into userName variable
userName = '';

/**
 * Using ternary expression
 * if the user does not input their name, it will simply logg "Hello!"
 * Else, it will use say "Hello (whatever username the user enters" using
 * string interpoloation.
 * For something simple as below, ternary expression is appropriate, otherwise
 * it would look messy if there were many conditions. Therefore, a switch or 
 * else if statements would be more appropriate.
 */
userName === '' ? console.log('Hello!') : console.log(`Hello, ${userName}!`);

let userQuestion = 'Should I marry my current partner?';
console.log(userQuestion);

/**
 * Generates a random number between 0 and 7. 
 * Using JS built-in method to determine a random number.
 */
randomNumber = Math.floor(Math.random() * 8);
//console.log(randomNumber); checking if the above works and does not generate a number more than 7

/**
 * Decided to use switch for the below control flow
 * If randomNumber generates a 7, then the answer  is signs point out to yes & so on.
 */
let eightBall = '';
switch (randomNumber) {
    case 0:
        eightBall = 'It is certain'
        break;
    case 1:
        eightBall = 'It is decidedly so'
        break;
    case 2:
        eightBall = 'Reply hazy try again'
        break;
    case 3:
        eightBall = 'Cannot predict now'
        break;
    case 4:
        eightBall = 'Do not count on it'
        break;
    case 5:
        eightBall = 'My sources say no'
        break;
    case 6:
        eightBall = 'Outlook not so good'
        break;
    case 7: 
        eightBall = 'Signs point to yes'
        break;
    //Added a default for best practices.
    default:
        eightBall = 'Uh, oh. Something went wrong. Try again!'
}

//Logs the above to the terminal
console.log(`Magic Eight Ball said...${eightBall}!`);