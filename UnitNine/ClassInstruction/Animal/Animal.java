package UnitNine.ClassInstruction.Animal;

public class Animal {
  private String animal;
  private String type;

  public Animal() {
    System.out.println("I am an ANIMAL");
  }

  public Animal(String a, String t) {
    animal = a;
    type = t;
  }

  public void move() {
    System.out.println("Step forward");
  }

  public void speak() {
    System.out.println("I am an animal making noise.");
  }

  public String toString() {
    return animal + " is a " + type;
  }
}