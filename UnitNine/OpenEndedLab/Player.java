package UnitNine.OpenEndedLab;

public class Player extends Entity {
    private int level;

    public Player() {
        super();
        level = 1;
    }

    public Player(String name, int health, int level) {
        super(name, health);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        level++;
    }

    public void useItem(Item item, Entity entity) {
        item.use(entity);
    }

    @Override
    public String toString() {
        return "Player[name=" + getName() + ",health=" + getHealth() + ",level=" + level + "]";
    }
}