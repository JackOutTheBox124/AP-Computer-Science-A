package UnitNine.ClassInstruction.Animal;

public class Bird extends Animal {
  public Bird() {
    super();
    System.out.println("But I am also a bird");
  }

  public Bird(String a, String t) {
    super(a, t);
  }

  // OVERRIDDEN METHOD FROM THE PARENT
  @Override
  public void move() {
    System.out.println("I am flying...");
  }

  // OVERRIDDEN METHOD FROM THE PARENT
  @Override
  public void speak() {
    System.out.println("I am a bird chirping.");
  }

  //NEW METHOD THAT THE PARENT DOESNT HAVE
  public void chirp() {
    System.out.println("I am chirping");
  }

  //NOTICE NO toString(), calls the PARENT toString()
}
