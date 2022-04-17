//Race numbers are assigned randomly. The below code assigns numbers than 1000
let raceNumber = Math.floor(Math.random() * 1000);

let registeredEarly = true;
let runnerAge = 17;

/**
 * If a runner regsitered early and they are aged 18 or over,
 * their race number is added an extra 1000
 */
if (registeredEarly && runnerAge >= 18) {
    raceNumber + 1000;
    //console.log(raceNumber);
}

// if runner regitered early AND their age is 18 or over, they will race at 9:30am.
if (registeredEarly && runnerAge >= 18) {
    console.log(`You will race at 9:30am. Your race number is: ${raceNumber}`);
} // else if their age is 18 and above, but did not register early, they will race at 11:00am.
 else if (runnerAge >= 18 && !registeredEarly) {
    console.log(`Unfortunately, you did not register early. You will race at 11:00am 
    and your race number is ${raceNumber}`);
} // else if their age is below 18, youth registeraction regardless of whether they registered
  // or not, will race at 2:30pm.
 else if ( runnerAge < 18) {
    console.log(`You will race at 12:30pm. Your race number is ${raceNumber}`);
} else {
    console.log(`Please see the registration desk!`);
}