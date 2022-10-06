package UnitThree.LessonThree;

import java.util.Scanner;

/**
 * We are going to revisit a former coding activity on temperature, with a slight adjustment.
 * <br>
 * You are running an experiment that involves tracking human body temperature. The "normal" body temperature can have a wide range from 97 to 99 degrees Fahrenheit.
 * <br>
 * Write the code for the sensor that will be tracking the temperature. If the temperature falls between 97 and 99 (inclusive) your code should print “Temperature is OK”. Otherwise, your code should print “NOT NORMAL”.
 * <br>
 * Sample Run 1:
 * <pre>
 * What is the temperature?
 * 101
 * NOT NORMAL
 * </pre>
 * Sample Run 2:
 * <pre>
 * What is the temperature?
 * 98
 * Temperature is OK
 * </pre>
 */
public class U3_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the temperature?");
    int temp = scan.nextInt();

    System.out.println(temp < 97 || temp > 99 ? "NOT NORMAL" : "Temperature is OK");
  }

}
