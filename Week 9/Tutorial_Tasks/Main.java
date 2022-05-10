package Tutorial_Tasks;

public class Main {
    
    public static void main(String[] args) {
        Character sonia = new Character("Sonia", "Black", "Brown", 4.9, 6, 10, "This is a test");
        System.out.println("Your character name is " + sonia.getName() + ". She has " + sonia.getMaxHealth() + " HP");

    }
}
