package UnitThree.LessonTwo;

import java.util.Scanner;

/**
 * You are running an experiment that involves tracking human body temperature. The "normal" body temperature can have a wide range from 97 to 99 degrees Fahrenheit.
 * <br>
 * Write the code for the sensor that will be tracking the temperature. If the temperature falls below 97 or above 99 your code should print “NOT NORMAL”. Your code should accept the temperature input as a double.
 * <br>
 * Sample run 1:
 * <pre>
 * What is the temperature?
 * 85.3
 * NOT NORMAL
 * </pre>
 * Sample run 2:
 * <pre>
 * What is the temperature?
 * 98.6
 * </pre>
 */
public class U3_L2_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the temperature?");
    double temp = scan.nextDouble();

    System.out.print(temp < 97 || temp > 99 ? "\nNOT NORMAL" : "");
  }
}
