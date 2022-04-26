//Creating a class to store 5 variabbles including exam subjets, total and the percentage
class Results {
    int physics;
	int chemistry;
	int biology;
	int totalGrade;
	float percentage;

    //Creating a class constructor to initialise class 
    Results(int physicsGrade, int chemistGrade, int biologyGrade) {
        physics  = physicsGrade;
        chemistry = chemistGrade;
        biology = biologyGrade;

        //Calculate the total mark for a student:
        totalGrade = physics + chemistry + biology;

        /**
         * Calculate the percentage 
         * To find the overall percentage a student has you can
         * multiply their score by 100 and then divide by 450:
         */

         percentage = (totalGrade * 100) / 450;
    }

    /**
     * Creates a method for displaying the results to the student:
     */
    String displayResults() {
        String results = "Physics: " + physics;
        //Add a new line using \n
        results += "\nChemistry: " + chemistry;
        results += "\nBiology: " + biology;
        results += "\nTotal: " + totalGrade;

        //return the results to the user
        return results;
    }

    //Create method to display percentage
    String displayPercentage() {
        return "Overall percentage: " + percentage;
    }

    /**
     * Method to check if user has achieved pass rate of 60%.
     * If the person receieves under 60% they fail, otherwise they 
     * pass:
     */
    String passRateCheck() {
        //Declare empty string to use in if statements:
        String subjectPassReturn = "";
        

        //if the percentage of score subjects are below 60
        if (percentage < 60) {
			subjectPassReturn = "Oh no... you failed :(. Better luck next time!";
		} else {
			subjectPassReturn = "Well done! Congratulations, you should be proud :)";
		}
        return subjectPassReturn;
    }
}

public class examResults {

	public static void main(String[] args) {
		Results myResults = new Results(90, 108, 89);
		
		//Displays the student results to the user
		System.out.println(myResults.displayResults());
		
		//Displays the student percentage
		System.out.println(myResults.displayPercentage());
		
        //Displays whether student passed or not.
        System.out.println(myResults.passRateCheck());
	}
}