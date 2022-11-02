package UnitFour.LessonTwo.U4_L2_Activity_Three;

import java.util.Scanner;

public class U4_L2_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // ints
    int answer = 1;

    //doubles
    double farNorth = -90;
    double farSouth = 90;
    double farEast = -180;
    double farWest = 180;
    double lon;
    double lat;

    while (answer == 1){
      System.out.println("Please enter the longitude: ");
      lon = scan.nextDouble();

      System.out.println("Please enter the latitude: ");
      lat = scan.nextDouble();

      if ((lon >= -180 && lon <= 180) && (lat >= -90 && lat <= 90)) {
        if (lat > farNorth) {
          farNorth = lat;
        }
        if (lat < farSouth) {
          farSouth = lat;
        }
        if (lon > farEast) {
          farEast = lon;
        }
        if (lon < farWest) {
          farWest = lon;
        }
      }
      else {
        System.out.println("Incorrect longitude or latitude");
      }
      System.out.println("Would you like to enter another location (1 for yes, 0 for no)? ");
      answer = scan.nextInt();
    }
    System.out.println("Farthest North: " + farNorth);
    System.out.println("Farthest South: " + farSouth);
    System.out.println("Farthest East: " + farEast );
    System.out.println("Farthest West: " + farWest);

  }
}
