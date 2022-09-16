package UnitTwo.ClassInstruction;

public class StringMethodsIntro {
  public static void main(String[] args) {
    //equals method: equals() returns a boolean

    String word = "Hello";
    String word1 = "Hello";
    System.out.println("word has the same characters as word1: " + word.equals(word1));
    System.out.println("word is in the same memory location as word1: " + (word == word1));
    System.out.println("********************************************************");

    String word0 = new String("Hello");
    System.out.println("word has the same characters as word0: " + word.equals(word0));
    System.out.println("word is in the same memory location as word0: " + (word == word0));
    System.out.println("********************************************************");


    String word2 = "HELLO";
    System.out.println("word has the same characters as word2: " + word.equals(word2));
    System.out.println("word is in the same memory location as word2: " + (word == word2));
    System.out.println("********************************************************");

  }
}
