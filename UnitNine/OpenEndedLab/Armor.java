package UnitNine.OpenEndedLab;

public class Armor extends Item {
    private int defense;

    public Armor() {
        super("Leather Armor", 5, 15);
        this.defense = 10;
    }
    public Armor(String name, int weight, int value, int defense) {
        super(name, weight, value);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void use() {
        System.out.println("You equip the " + getName() + " armor.");
    }

    public String toString() {
        return super.toString() + ", Defense: " + defense;
    }
}