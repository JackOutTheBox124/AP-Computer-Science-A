package UnitNine.OpenEndedLab;

public class Weapon extends Item {
    private int damage;

    public Weapon() {
        super("Wooden Sword", 5, 5);
        this.damage = 10;
    }

    public Weapon(String name, int damage, int weight, int value) {
        super(name, weight, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void use(Entity entity) {
        if (entity instanceof Enemy enemy) {
            enemy.takeDamage(damage);
        }
    }

    @Override
    public String toString() {
        return "Weapon[name=" + getName() + ",damage=" + damage + ",weight=" + getWeight() + ",value=" + getValue() + "]";
    }
}