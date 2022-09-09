package UnitOne.ClassInstruction;

public class CastingChars {
  public static void main(String[] args) {
    // A
    int i = 'a';
    System.out.println(i);

    // B
    char c = 65;
    System.out.println(c);

    int e = 45;
    char d = (char)e; // this line requires a cast: char d = (char) x

    // C
     char ch = 65;
     String word = "" + ch; //No cast BUT must concatenate the char onto an empty String!

    /*
    char ch = 'A';
    String word = ch;
    System.out.println(word);
    */

    // D

    int x = 65;
    double y = x;
    System.out.println(y);

    // E

    char cha = 'A';
    double z = cha;
    System.out.println(z);

  }
}
