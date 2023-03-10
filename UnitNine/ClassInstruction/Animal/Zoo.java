package UnitNine.ClassInstruction.Animal;

import UnitOne.ClassInstruction.DataDemo;

import java.lang.reflect.Method;

public class Zoo {
  public static void main(String[] args) {
    System.out.println("ANIMAL OBJECTS AND BEHAVIORS");

    Animal a = new Animal();
    a.move();
    a.speak();
    System.out.println(a.toString());

    System.out.println("********************************");
    System.out.println("BIRD OBJECTS AND BEHAVIORS");
    Bird b = new Bird();
    b.move();
    b.chirp(); // THIS WORKS BECAUSE b is a BirdIRD DATA TYPE and a Bird OBJECT so chirp() is called.

    System.out.println("********************************");

    Animal tweety = new Bird();
    tweety.move(); // move exists in BOTH child and parent class so the child class overrides the parent class
    System.out.println("********************************");

    Animal tweety1 = new Bird();
    tweety1.move();

    // This does not work because tweety1 is an animal data type and chirp doesnt exist in the parent class
    // Method visibility is driven by the DATA TYPE unless the method is OVERRIDDEN
    // tweety1.chirp();
  }

}
