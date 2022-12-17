package UnitFive.FRQs.HiddenWord;

public class HiddenWordTester {
  public static void main(String[] args) {
    /********** Tester Class **********
     * This class is for testing only.
     * You do not need to update this
     * file. Complete your work in the
     * HiddenWorld.java file
     *********************************/

    HiddenWord puzzle = new HiddenWord("HARPS");
    System.out.println(puzzle.getHint("AAAAA")); //+A+++
    System.out.println(puzzle.getHint("HELLO")); //H****
    System.out.println(puzzle.getHint("HEART")); //H*++*
    System.out.println(puzzle.getHint("HARMS")); //HAR*S
    System.out.println(puzzle.getHint("HARPS")); //HARPS
    HiddenWord student1 = new HiddenWord("COMPSC");
    System.out.println(student1.getHint("ABCDEF")); //**+***

  }
}