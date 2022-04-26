public class ReversingStringsSentences{

	public static void main(String[] args) {

        //declaring string variables
		String sentence = "Are you as excited as I am?";

        //Declared an empty string var to be used later
        String reverseSentence = " ";

        /**
         * Using Java split method to split each word using a " "(space)
         * as the splitter.
         * The result is assigned to a String[] which is an
         * array called stringArray
         */
        String[] stringArray = sentence.split(" ");

        /**
         * Using a for loop to iterate the stringArray backwords
         * using - 1
         * iterating backwards using i-- incrementer 
         * Used https://stackoverflow.com/questions/9379489/looping-through-the-elements-in-an-array-backwards 
         * to help writing a for loop to iterate backwwards
         */
		for(int i = stringArray.length-1; i >= 0; i--){
            reverseSentence += (stringArray[i] + " ");
        }

        //Prints out the results
        System.out.println(reverseSentence);
        //output is:  am? I as excited as you Are 



        //PART 2

        //declaring an array of strings
        String[] wordList = {"Stressed", "Parts", "Straw", "Keep", "Wolf"};

        //Empty variable which will be used in the for loop
        String reversedWord;

        /**
         * For loop to reverse the words
         * Contains another loop inside
         */
        for (int i = wordList.length - 1; i >=0; i--) {
            reversedWord ="";

            //Was getting an error when using just length. 
            //Not sure why it is working with .length() 
            //Maybe it is bc I am also iterating through the wordList?
            for(int j = wordList[i].length() -1; j >= 0; j--){
                reversedWord += wordList[i].charAt(j);
            }

            //Printing out to the console
            System.out.println(reversedWord);
        }
    
	} 
}