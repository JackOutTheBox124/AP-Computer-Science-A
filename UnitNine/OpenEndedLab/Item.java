package UnitNine.OpenEndedLab;

public class Item {
    private String name;
    private int weight;
    private int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public Item() {
        this("Unnamed Item", 1, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public void use(Entity entity) {
        System.out.println(entity.getName() + " uses " + name);
    }

    @Override
    public String toString() {
        return "Item[name=" + name + ",weight=" + weight + ",value=" + value + "]";
    }
}