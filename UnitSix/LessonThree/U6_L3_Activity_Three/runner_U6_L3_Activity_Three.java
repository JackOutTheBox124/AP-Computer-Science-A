package UnitSix.LessonThree.U6_L3_Activity_Three;

import java.util.Scanner;
public class runner_U6_L3_Activity_Three
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    scan.nextLine();
    String[] wordList = new String[len];
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++)
    {
      wordList[i] = scan.nextLine();
    }
    System.out.println();
    U6_L3_Activity_Three.printUn(wordList);
  }
}