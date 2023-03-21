package UnitNine.OpenEndedLab;

public class Enemy extends Entity {
    private int damage;

    public Enemy() {
        super();
        damage = 10;
    }

    public Enemy(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Entity entity) {
        entity.takeDamage(damage);
    }

    @Override
    public String toString() {
        return "Enemy[name=" + getName() + ",health=" + getHealth() + ",damage=" + damage + "]";
    }
}