package HLT.Text_Based_Game;

//Creates a character class 
public class Character {

    // Declared the Character class's attributes private.
    // This is to avoid the class members being visible to everything in the package
    private String name;
    private String skill;
    private int currentHealth;
    private int maxHealth;

    // Creates a constructor of Character class:
    // Variables are public.

    public Character(String name, String skill, int currentHealth, int maxHealth) {
        this.name = name;
        this.skill = skill;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
    }

    // Creates setters & getters to be used in the Main.java.
    // This is not direct manipulation as that is bad practice.
    // However, we've put the attributes into methods to be used
    // && accessed correctly.

    // Please note, I've detleted setName() as we do not want to amend this.
    public String getName() {
        return this.name;
    }

    public String getSkill() {
        return this.skill;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

}
