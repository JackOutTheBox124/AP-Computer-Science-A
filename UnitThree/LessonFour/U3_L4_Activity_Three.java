package UnitThree.LessonFour;

import java.util.Scanner;

/**
 * Latitude and Longitude are a coordinate system to describe the location of any plane on Earth’s Surface. Latitude is written as a decimal number ranging from -90 to 90 and Longitude is also written as a decimal number ranging from -180 to 180.
 * <br>
 * Write a program which takes two decimal inputs and tests if they are within the valid ranges. In other words, your program should test to see if the latitude entered is between -90 and 90 inclusive and the longitude entered is between -180 and 180 inclusive.
 * <br>
 * Sample Run 1:
 * <pre>
 * Please enter the latitude:
 * 898.232
 * Please enter the longitude:
 * 34.0
 * latitude is incorrect
 * </pre>
 * Sample Run 2:
 * <pre>
 * Please enter the latitude:
 * -200
 * Please enter the longitude:
 * -200
 * latitude is incorrect
 * longitude is incorrect
 * </pre>
 * Sample Run 3:
 * <pre>
 * Please enter the latitude:
 * 40.71
 * Please enter the longitude:
 * -74.01
 * The location: 40.71, -74.01
 * </pre>
 */
public class U3_L4_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the latitude:");
    double lat = scan.nextDouble();
    System.out.println("Please enter the longitude:");
    double lon = scan.nextDouble();
    if (90 < lat || lat < -90) {
      System.out.println("latitude is incorrect");
    }
    if (180 < lon || lon < -180) {
      System.out.println("longitude is incorrect");
    }
    if ((90 >= lat && lat >= -90) && (180 >= lon && lon >= -180)) {
      System.out.println("The location: " + lat + ", " + lon);
    }

  }
}

