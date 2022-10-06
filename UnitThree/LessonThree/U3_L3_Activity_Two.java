package UnitThree.LessonThree;

import java.util.Scanner;

/**
 * Write a program that takes input as a String letter grade from the keyboard and translates it to a grade range. For example, if a user enters “A”, the program should output “90-100”.
 * <pre>
 * “A” = “90-100”
 * “B” = “80-90”
 * “C” = “70-80”
 * “D” = “60-70”
 * “F” = “0-60”
 * </pre>
 * The program should only accept the five strings outlined above. If the user enters any other strings, the program should print “Invalid letter grade”.
 * <br>
 * Sample run 1:
 * <pre>
 * Please enter a letter grade:
 * A
 * 90-100
 * </pre>
 * Sample run 2:
 * <pre>
 * Please enter a letter grade:
 * a
 * Invalid letter grade
 * </pre>
 * Sample run 3:
 * <pre>
 * Please enter a letter grade:
 * abc
 * Invalid letter grade
 * To gain full credit for this exercise you will need to use else if statements when checking the grade.
 * </pre>
 * Hint: For comparing the strings, you should be using the {@link String#equals(Object) .equals()} method from the string class.
 */
public class U3_L3_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String range = "";
    System.out.println("Please enter a letter grade:");
    String letter = scan.nextLine();
    if(letter.equals(letter.toLowerCase())) {
      System.out.println("Invalid letter grade");
    }
    else if (!letter.equals(letter.toLowerCase())) {
      // switch (letter) {
      //   case "A" -> range = "90-100";
      //   case "B" -> range = "80-90";
      //   case "C" -> range = "70-80";
      //   case "D" -> range = "60-70";
      //   case "F" -> range = "0-60";
      //   default -> range = "Invalid letter grade";
      // }
      // switch (letter) {
      //   case "A":
      //     range = "90-100";
      //     break;
      //   case "B":
      //     range = "80-90";
      //     break;
      //   case "C":
      //     range = "70-80";
      //     break;
      //   case "D":
      //     range = "60-70";
      //     break;
      //   case "F":
      //     range = "0-60";
      //     break;
      //   default:
      //     range = "Invalid letter grade";
      // }

      if(letter.equals("A")) {
        range = "90-100";
      }
      else if (letter.equals("B")) {
        range = "80-90";
      }
      else if (letter.equals("C")) {
        range = "70-80";
      }
      else if (letter.equals("D")) {
        range = "60-70";
      }
      else if (letter.equals("F")) {
        range = "0-60";
      }
      else {
        range = "Invalid letter grade";
      }
      System.out.println(range);
    }
  }
}