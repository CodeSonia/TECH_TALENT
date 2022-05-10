package HLT.Text_Based_Game;

/**
 * Creates a Map class:
 * 
 * This is to generate the area the character player can move in.
 */
public class Map {
    
    // Declaring private variables

    // Declares the max x and y positions
    private int x;
    private int y;

    // Declared variables that informs player's current position in the game:
    private int currentX;
    private int currentY;

    // Creates a constructor of Map
    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Creating getters for var x and y:
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Create both getters and setters for var
    // getCurrentX and getCurrentY
    public int getCurrentX() {
        return this.currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return this.currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }
    
    public void move(String direction) {

        // North direction:
        // Using equals() to compare strings
        if (direction.equals("N")) {
            // If currentY is higher than y, value loops to 0
            if (this.currentY == this.y) {
                this.currentY = 0;
            } else {
                // Increment the position by 1
                setCurrentY(this.currentY + 1);
                // Tells the user in ther terminal where their current location is
                System.out.println("Your current x location is: " + currentX + " and your current y location is: " + currentY);
            }
            
        // East direction:
        } else if (direction.equals("E")) {
            if (this.currentX == this.x) {
                this.currentX = 0;
            } else {
                setCurrentX(this.currentX + 1);
                System.out.println("Your current x location is: " + currentX + " and your current y location is: " + currentY);
            }
            
        // South direction:
        } else if (direction.equals("S")) {
            if (this.currentY == this.y) {
                this.currentY = 0;
            } else {
                // This time we decrement the value by 1
                setCurrentY(this.currentY - 1);;
                System.out.println("Your current x location is: " + currentX + " and your current y location is: " + currentY);
            }
        
        // West direction:
        } else if(direction.equals("W")) {
            if (this.currentX == this.x) {
                this.currentX = 0;
            } else {
                setCurrentX(this.currentX - 1);;
                System.out.println("Your current x location is: " + currentX + " and your current y location is: " + currentY);
            }
        
        // Added an else clause, if user enters incorrect direction value
        } else {
            System.out.println("Ay, unfortunately that did not work :(... Please try again!");
        }
    }
}
