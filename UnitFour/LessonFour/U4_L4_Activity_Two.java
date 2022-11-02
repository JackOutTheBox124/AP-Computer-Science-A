package UnitFour.LessonFour;

import java.util.Scanner;

public class U4_L4_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string:");
    String word = scan.nextLine();
    word = word.toLowerCase();

    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (letter == 'e' || letter == 't' || letter == 'a' || letter == 'i' || letter == 'o') {
      } else {
        System.out.print(letter);
      }
    }
  }
}