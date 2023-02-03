package UnitSix.ClassInstruction.StringArrays;

import java.util.Scanner;

public class stringArrays_start {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] wordList = new String[5];
    printArray(wordList);

    // for (int i = 0; i < wordList.length; i++) {
    //   System.out.print(wordList[i] + (i == wordList.length - 1 ? "" : ", "));
    // }

    System.out.println("\nPlease enter 5 strings below");
    for (int i = 0; i < wordList.length; i++) {
      String input = scan.nextLine();
      wordList[i] = input;
    }
    printArray(wordList);
    String lastWord = wordList[wordList.length - 1];
    System.out.println(lastWord + " " + lastWord.length());
    System.out.println(lastWord.charAt(lastWord.length() - 1));
  }

  public static void printArray(String[] stringArray) {
    System.out.println(String.join(", ", stringArray));
  }
}
