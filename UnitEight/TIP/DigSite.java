package UnitEight.TIP;

//Unit 8: 2D Arrays Timed in Class Program
import java.util.Scanner;
import java.util.ArrayList;

public class DigSite {

  // Method to print 2D array
  public static void print(int[][] a) {
    // Iterate through rows
    for (int[] ints : a) {
      // Iterate through columns
      for (int c = 0; c < a[0].length; c++) {
        // Print value with formatting
        System.out.print(ints[c] + "   ");
      }
      // Print newline character at end of row
      System.out.println();
    }
  }

  // Method to assign random artifact values to a 2D array
  public static void assignArtifacts(int [][]a) {
    // Iterate through rows
    for(int r = 0; r <a.length; r++) {
      // Iterate through columns
      for(int c = 0; c <a[0].length; c++) {
        // Assign random value between 0 and 10 to each location
        a[r][c] = (int)(Math.random()*10 + 0);
      }
    }
  }

  // Method to print total square footage of the dig site
  public static void squareFt(int[][]a) {
    // Calculate total square footage by multiplying number of rows by number of columns
    int totalSqFt = a.length * a[0].length;
    // Print result with formatting
    System.out.println("Total square feet at the site: " + totalSqFt);
  }

  // Method to print total number of artifacts found at the dig site
  public static void totalArtifacts(int [][]a) {
    int total = 0;
    // Iterate through rows
    for (int[] ints : a) {
      // Iterate through columns
      for (int c = 0; c < a[0].length; c++) {
        // Add value at current location to total
        total += ints[c];
      }
    }
    // Print result with formatting
    System.out.println("Total number of artifacts found: " + total);
  }

  // Method to count number of locations on the grid that have a certain number of artifacts
  public static int numArtifacts(int [][] a, int num) {
    int count = 0;
    // Iterate through rows
    for (int[] ints : a) {
      // Iterate through columns
      for (int c = 0; c < a[0].length; c++) {
        // If value at current location matches target number, increment count
        if (ints[c] == num) {
          count++;
        }
      }
    }
    // Print result with formatting
    System.out.println("Number of locations with " + num + " artifact(s): " + count);
    // Return count value
    return count;
  }

  // Method to generate an ArrayList of all locations that contain a given number of artifacts
  public static ArrayList<Location> locations(int[][] a, int num) {
    // Create empty ArrayList to hold matching locations
    ArrayList<Location> list = new ArrayList<>();
    // Iterate through rows
    for (int r = 0; r < a.length; r++) {
      // Iterate through columns
      for (int c = 0; c < a[0].length; c++) {
        // If value at current location matches target number, add Location object to list
        if (a[r][c] == num) {
          list.add(new Location(r, c));
        }
      }
    }
    // Return ArrayList of matching locations
    return list;
  }


  //MAIN METHOD
  public static void main(String [] args) {
    int[][] grid = new int[5][6];
    assignArtifacts(grid);
    print(grid);

    squareFt(grid);
    totalArtifacts(grid);

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of artifacts to search for: ");
    int num = sc.nextInt();
    numArtifacts(grid, num);

    ArrayList<Location> locationsList = locations(grid, num);
    System.out.println("Locations with " + num + " artifact(s): " + locationsList);
  }

}