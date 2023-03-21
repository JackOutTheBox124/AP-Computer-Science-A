package UnitNine.OpenEndedLab;

public class Food extends Item {
    private int healingAmount;
    private boolean isPoisonous;

    public Food() {
        super("Apple", 1, 5);
        this.healingAmount = 5;
        this.isPoisonous = false;
    }

    public Food(String name, int healingAmount, int damageAmount) {
        super(name, 1, 10);
        this.healingAmount = healingAmount;
    }

    public int getHealingAmount() {
        return healingAmount;
    }

    public void setHealingAmount(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

    public void use(Player player) {
        if (isPoisonous) {
            player.takeDamage(healingAmount / 2);
        } else {
            player.heal(healingAmount);
        }
    }

    @Override
    public String toString() {
        return "Food[name=" + getName() + ",healingAmount=" + healingAmount + ",isPoisonous=" + isPoisonous + "]";
    }
}