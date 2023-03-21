package UnitNine.OpenEndedLab;

public class Entity {
    private String name;
    private int health;

    public Entity() {
        name = "Unnamed Entity";
        health = 100;
    }

    public Entity(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void heal(int amount) {
        health += amount;
    }

    @Override
    public String toString() {
        return "Entity[name=" + name + ",health=" + health + "]";
    }
}