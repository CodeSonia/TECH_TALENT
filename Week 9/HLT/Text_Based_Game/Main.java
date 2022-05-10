package HLT.Text_Based_Game;

// Import scanner to obtain user input:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Created mainPlayer which instantiates from the Character constructor:
        // Character inspired from Euphoria cast:
        Character mainPlayer = new Character("Rue", "Deceit", 30, 100);

        // Created a map with a 10, 10 size.
        Map characterMap = new Map(10, 10);

        // Using Math.random() to place the character in the map using x and y values:
        characterMap.setCurrentX((int) Math.floor(Math.random() * 10));
        characterMap.setCurrentY((int) Math.floor(Math.random() * 10));

        System.out.println(mainPlayer.getName()
                + " Enter safe spaces! You'll need to find your way back to the safe zone, otherwise you'll enter a bad zone! :( ");

        try (// Used: https://www.w3schools.com/java/java_user_input.asp to help with the below:
                // Creates a scanner object 
        Scanner characterInput = new Scanner(System.in)) {
            String direction;


            // Creates a while loop to always run the first set of conditions i.e. entering destination.
            // The loop only ends when a player x and y position reaches 5
            while(true) {
                System.out.println("Hey " + mainPlayer.getName()+"! " + "Enter which direction you'd like to go. Acceptable values are: S = South, W = West, N = North or E = East ");
                direction = characterInput.next();
                characterMap.move(direction.strip());

                if (characterMap.getCurrentX() == 5 && characterMap.getCurrentY() == 5) {
                    System.out.println("Ayyy! You've done it! Well done " + mainPlayer.getName() + " You've entered the safe zone :)!!");
                    break;
                }
            }
        }
    }

}
