package UnitSeven.ClassInstruction;

import java.util.ArrayList;

public class PracticeProblem {
  public static void main(String[] args) {
    ArrayList<String> pets = new ArrayList<String>();

    pets.add("dog");
    pets.add("cat");
    pets.add("horse");
    pets.add("bird");
    pets.add("hedgehog");
    pets.add("fish");
    pets.add("racoon");
    pets.add("iguana");

    // print out only pets that end with g
    for (String pet: pets) {
      if (pet.endsWith("g")) {
        System.out.println(pet);
      }
    }
  }

}
