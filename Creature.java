public class Creature {
    private String name;
    private int powerLevel;

    // Constructor
    public Creature(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    //methods
    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    
    public String toString() {
        return name + " - Power Level: " + powerLevel;
    }
}
