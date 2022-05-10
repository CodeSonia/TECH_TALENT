package Walk_Through;

/**
 * The below class is not great.
 * This is because the output is 2 good guys, not 1 good guy and 1 baddie.
 * This shows the Character class will share the characteristics of "Good Guy",
 * with "Bad Guy". To overcome this, we create a class Constructor, where we can
 * create multiple objects/instances of the Character class.
 * public class Character {
 * String name = "Good Guy";
 * int maxHealth = 100;
 * int currentHealth = 100;
 * int movementDistance = 10;
 * int attackValue = 5;
 * int defenceValue = 8;
 * }
 */

// Create a constructor:

public class Character {
    // These are the different attributes of the Character class
    // To avoid the class members being visible to everything within the package,
    // ... we change the access types to private.
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int movementDistance;
    private int attackValue;
    private int defenceValue;

    // Ensure you reference the variables in the parametors of the Character method.
    // Character(String name, int maxHealth, int currentHealth, int
    // movementDistance, int attackValue, int defenceValue){
    // this keyword is very. important for OOP.
    // It is associating the name variable to the one that is being called in the
    // constructor from the main.
    // this.name = name;
    // this.maxHealth = maxHealth;
    // this.currentHealth = currentHealth;
    // this.movementDistance = movementDistance;
    // this.attackValue = attackValue;
    // this.defenceValue = defenceValue;

    // }

    /**
     *  public Character(String name, int maxHealth, int currentHealth, int movementDistance, int attackValue,
            int defenceValue) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.movementDistance = movementDistance;
        this.attackValue = attackValue;
        this.defenceValue = defenceValue;
    }
     */

    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMovementDistance() {
        return this.movementDistance;
    }

    public void setMovementDistance(int movementDistance) {
        this.movementDistance = movementDistance;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDefenceValue() {
        return this.defenceValue;
    }

    public void setDefenceValue(int defenceValue) {
        this.defenceValue = defenceValue;
    }

    public Character(int maxHealth, int currentHealth, int movementDistance, int attackValue, int defenceValue) {
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.movementDistance = movementDistance;
        this.attackValue = attackValue;
        this.defenceValue = defenceValue;
    }
}