package HLT.HashMaps;

import java.util.HashMap; // import the HashMap class

public class HashMaps {

    public static void main(String[] args) {

        // Creating a HashMap object called euphoriaCast
        HashMap<String, String> euphoriaCast = new HashMap<String, String>();

        // Add keys and values (Euphoria Cast, Actor):

        euphoriaCast.put("Rue", "Zendaya");
        euphoriaCast.put("Jules", "Hunter Schafer");
        euphoriaCast.put("Maddy Perez", "Alexa Demie");
        euphoriaCast.put("Fezco", "Angus Cloud");

        // Use the get() method to retrive the value in the HashMap
        // System.out.println(euphoriaCast.get("Rue"));

        // Use the remove() method to remove an item:
        // euphoriaCast.remove("Jules");
        // System.out.println(euphoriaCast);

        // HashMap size() to find out how many elements there are:
        // System.out.println(euphoriaCast.size());

        // Loop through each item using a for each loop:
        // This loops through each key
        /**
         * for (String item : euphoriaCast.keySet()) {
         * System.out.println(item);
         * }
         * 
         * // The for loops through each value:
         * 
         * for (String val : euphoriaCast.values()) {
         * System.out.println(val);
         * }
         */

        // Print out both KEYS & VALUES:

        for (String i : euphoriaCast.keySet()) {
            System.out.println("keys: " + i + " value: " + euphoriaCast.get(i));
        }

        /**
         * Output:
         * 
         * keys: Rue value: Zendaya
         * keys: Maddy Perez value: Alexa Demie
         * keys: Jules value: Hunter Schafer
         * keys: Fezco value: Angus Cloud
         */

    }

}
