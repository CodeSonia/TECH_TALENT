package Tutorial_Tasks;

public class Character {
    private String name;
    private String hairColor;
    private String eyeColor;
    private Double Height;
    private int currentHealth;
    private int maxHealth;
    private String description;

    Character(String name, String hairColor, String eyeColor, double Height, int currentHealth, int maxHealth,
            String description) {
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.Height = Height;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.description = description;
    }


    //Only a getter for name attribute
    public String getName() {
        return this.name;
    }


    //only a getter for hair color as we do not want to change this
    public String getHairColor() {
        return this.hairColor;
    }


    //Same as above
    public String getEyeColor() {
        return this.eyeColor;
    }

    public Double getHeight() {
        return this.Height;
    }

    public void setHeight(Double Height) {
        this.Height = Height;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
