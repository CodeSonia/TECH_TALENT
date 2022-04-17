let raceNumber = Math.floor(Math.random() * 1000);

const registeredEarly = true;
const runnerAge = 28;

if (registeredEarly && runnerAge >= 18) {
    raceNumber + 1000;
    //console.log(raceNumber);
}

if (registeredEarly && runnerAge >= 18) {
    console.log(`You will race at 9:30am. Your race number is: ${raceNumber}`);
} else if (runnerAge >= 18 && !registeredEarly) {
    console.log(`Unfortunately, you did not register early. You will race at 11:00am 
    and your race number is ${raceNumber}`);
} else if ( runnerAge < 18) {
    console.log(`You will race at 12:30pm. Your race number is ${raceNumber}`);
} else {
    console.log(`Please see the registration desk!`);
}