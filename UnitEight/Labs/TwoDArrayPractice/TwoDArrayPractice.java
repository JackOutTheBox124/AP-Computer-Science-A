package UnitEight.Labs.TwoDArrayPractice;

import java.util.Scanner;

public class TwoDArrayPractice {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int rows = input.nextInt();

    System.out.print("Enter the number of columns: ");
    int columns = input.nextInt();

    int[][] array1 = questionOne(rows, columns);
    printArray(array1);

    int[][] array2 = questionTwo(rows, columns);
    printArray(array2);

    int[][] array3 = questionThree(rows, columns);
    printArray(array3);
  }

  // Question #1
  public static int[][] questionOne(int rows, int columns) {
    int[][] array = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        array[i][j] = i + 1;
      }
    }

    return array;
  }

  // Question #2
  public static int[][] questionTwo(int rows, int columns) {
    int[][] array = new int[rows][columns];

    // goober code here


    return array;
  }

  // Question #3
  public static int[][] questionThree(int rows, int columns) {
    int[][] array = new int[rows][columns];

    // goober code here

    return array;
  }

  public static void printArray(int[][] array) {
    for (int[] row : array) {
      for (int column : row) {
        System.out.print(column + " ");
      }
      System.out.println();
    }
  }
}

