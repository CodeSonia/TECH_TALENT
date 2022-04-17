/*const variable used as the value assigned to a const will not change. If you try to change the value assigned to a const,
it will result in TypeError. If you leave the value empty, and try to assign it again, it will log as a Syntax Error
*/
const kelvin = 0; // program works for any Kelvin temperature, output is "The temperature is -460 degrees Fahrenheit"
//console.log(kelvin);

/* Converts celsius by subracting 273 on Kelvin varaible. Value is assigned to celsius. Used console.log to see if it is 
logging correctly.
*/
let celsius = kelvin - 273;
//console.log(celsius);


/** 
 * Below equation stored in fahrenheit variable calculates farhrenheit. 
 * Variable let is used, as we are able to change the value stored in the variable.
 * Again, used console.log for debugging purposes.
 */
let fahrenheit = celsius * (9/5) + 32;
//console.log(fahrenheit);

/**  
 * If fahrenheit produced a decimal number, we will need to round it up. To do this,
 * using JS built-in method Math.floor() to round down to the nearest integer.
 * 
*/
fahrenheit = Math.floor(fahrenheit); //used fahrenheit variable to round down to nearest integer.
//console.log(fahrenheit);

console.log(`The temperature is ${fahrenheit} degrees Fahrenheit`);