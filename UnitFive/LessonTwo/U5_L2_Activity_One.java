package UnitFive.LessonTwo;

/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

/**
 * Write a method that takes a single integer parameter that represents the hour of the day (in 24 hour time) and prints the time of day as a string. The hours and corresponding times of the day are as follows:
 * <br>
 * 0 = “midnight”
 * <br>
 * 12 = “noon”
 * <br>
 * 18 = “dusk”
 * <br>
 * 0-12 (exclusive) = “morning”
 * <br>
 * 12-18 (exclusive) = “afternoon”
 * <br>
 * 18-24 (exclusive) = “evening”
 * <br>
 * You may assume that the actual parameter value passed to the method is always between 0 and 24, including 0 but excluding 24.
 * This method must be called <code>timeOfDay()</code> and it must have an integer parameter.
 * <br>
 * Calling <code>timeOfDay(8)</code> should print “morning” to the screen, and calling <code>timeOfDay(12)</code> should print “noon” to the screen.
 * <br>
 * You can call your method in the program's main method so you can test whether it works, but you must remove or comment out the main method before checking your code for a score.
 */
public class U5_L2_Activity_One {

  /* Add the method monthName here */

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){

  }
  */

  public static void timeOfDay(int hour) {
    switch (hour) {
      case 0:
        System.out.println("midnight");
        break;
      case 12:
        System.out.println("noon");
        break;
      case 18:
        System.out.println("dusk");
        // case  0 -> System.out.println("midnight");
        // case 12 -> System.out.println("noon");
        // case 18 -> System.out.println("dusk");
        // default -> {
      default:
        if (hour > 0 && hour < 12) {
          System.out.println("morning");
        }
        else if (hour > 12 && hour < 18) {
          System.out.println("afternoon");
        }
        else if (hour > 18 && hour < 24) {
          System.out.println("evening");
        }
        break;
    }
  }
}