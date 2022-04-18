//variable that contains an arry of fruits
fruits = ['Apple', 'Orange', 'Banana', 'Pear', 'Peach', 'Strawberry', 'Cherry', 'Acai'];


// Iterating though the array using a for in loop
for (let fruit in fruits) {

    //creates two variables for vowels and consonants
    let vowels = 0;
    let consonants = 0;

    //creating another loop using the i as the iterator

    /**
     * The for loop determines how many vowels and
     * consonants there are
     */
    for (let i = 0; i < fruits[fruit].length; i++ ) {
      
        // using switch to determine what to add to vowels and consonants
        switch (fruits[fruit][i]) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "i":
                vowels = vowels + 1;
                break;

            default:
                consonants = consonants + 1;
        }
        // logs each vowel and constant for each fruit in array
    } console.log (`${fruits[fruit]} has ${vowels} vowels and ${consonants} consonants`);
}

