package UnitNine.OpenEndedLab;

public class Potion extends Item {
    private int healingAmount;
    private int damageAmount;

    public Potion() {
        super("Small Healing Potion", 1, 10);
        this.healingAmount = 20;
        this.damageAmount = 0;
    }

    public Potion(String name, int healingAmount, int damageAmount) {
        super(name, 1, 10);
        this.healingAmount = healingAmount;
        this.damageAmount = damageAmount;
    }

    public int getHealingAmount() {
        return healingAmount;
    }

    public void setHealingAmount(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public int getDamageAmount() {
        return damageAmount;
    }

    public void setDamageAmount(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    public void use(Entity entity) {
        if (entity instanceof Player player) {
            player.heal(healingAmount);
        } else if (entity instanceof Enemy enemy) {
            enemy.takeDamage(damageAmount);
        }
    }

    @Override
    public String toString() {
        return "Potion[name=" + getName() + ",healingAmount=" + healingAmount + ",damageAmount=" + damageAmount + ",weight=" + getWeight() + ",value=" + getValue() + "]";
    }
}