package UnitFour.LessonFour;

import java.util.Scanner;

public class U4_L4_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two strings:");

    String word1 = scan.nextLine();
    String word2 = scan.nextLine();
    String output = "";

    int i = word1.length();
    int j = word2.length();

    if ((word1.length()) == (word2.length()))
    {
      while (i> 0 && j > 0){
        System.out.print(word2.charAt(j-1));
        System.out.print(word1.charAt(i-1));
        i--;
        j--;
      }
    }
    else {
      System.out.println("error");
    }
  }
}