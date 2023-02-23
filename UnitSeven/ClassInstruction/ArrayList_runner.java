package UnitSeven.ClassInstruction;

import java.util.Arrays;

public class ArrayList_runner {
  public static void main(String[] args) {
    int[] a1 = {2, 4, 6, 8};
    int[] a2 = new int[4];

    for (int num : a1) {
      System.out.println(num);
    }
    System.out.println("ONE dimensional array");

    int [][] a3 = { {2,4,6}, {8,10,12}, {14,16,18}, {20,22,24} };

    System.out.println(a3);
    System.out.println(Arrays.deepToString(a3));
    print2D(a3);
    printAmongUs();
  }

  /**
   * Prints a 2D array of integers to the console in a grid format.
   * @param arr2D the 2D array to print.
   */
  public static void print2D(int[][] arr2D) {
    for(int[] arr1D : arr2D) {
      for(int num : arr1D) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  public static void printAmongUs() {
    String[] sussy = {
      "       ⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣿⣿⣷⣶⣄⣀⣀      ",
      "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣾⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀  ",
      "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⡟⠁⣰⣿⣿⣿⡿⠿⠻⠿⣿⣿⣿⣿⣧  ",
      "⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⠏⠀⣴⣿⣿⣿⠉⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣇ ",
      "⠀⠀⠀⢀⣠⣼⣿⣿⣿⡏⠀⢠⣿⣿⣿⠇⠀⠀⠀⠀ ⠀⠀⠀⠈⣿⣿⣿⡇ ",
      "⠀⠀⣰⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⡀⠀⠀⠀⠀⠀ ⠀⠀⠀⣿⣿⣿⡇ ",
      "⠀⢰⣿⣿⡿⣿⣿⣿⣿⡇⠀⠘⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀ ⢀⣸⣿⣿⣿⠁ ",
      "⠀⣿⣿⣿⠁⣿⣿⣿⣿⡇⠀⠀⠻⣿⣿⣿⣷⣶⣶⣶⣶⣶⣿⣿⣿⣿⠃  ",
      "⠀⢰⣿⣿⡇⠀⣿⣿⣿⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁    ",
      "⠀⢸⣿⣿⡇⠀⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠛⠉⢉⣿⣿       ",
      "⠀⢸⣿⣿⣇⠀⣿⣿⣿⠀⠀⠀⠀⠀⢀⣤⣤⣤⡀⠀⠀⢸⣿⣿⣿⣷⣦⠀   ",
      "⠀⢸⣿⣿⣿⣶⣿⣿⣿⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣦⡀⠀⠉⠉⠻⣿⣿⡇  ",
      "⠀⢸⣿⣿⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀⠈⠹⣿⣿⣇⣀⠀⣠⣾⣿⣿⡇  ",
      "⠀⠀⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣤⣤⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⡟  ",
      " ⠀⠀⠀⠀     ⠉⠻⢿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠛⠋⠉⠉⠁⠀⠀ ",
      "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠈⠉⠉⠉⠉⠁             "
    };
    for (String imposter : sussy) {
      System.out.println(imposter);
    }
  }
}