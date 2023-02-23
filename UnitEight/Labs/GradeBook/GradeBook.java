package UnitEight.Labs.GradeBook;

import UnitSix.AssignmentSix.Student;

import java.util.Arrays;

public class GradeBook {
  public static void main(String[] args) {
    int[][] testScores = new int[20][4];

    testScores = fillScores(testScores);
    printScores(testScores);
    printAverages(testScores);
    printIsImproving(isImproving(testScores));
    printColumnAverages(testScores);

  }

  public static int[][] fillScores(int[][] emptyTestScores) {
    int[][] testScores = new int[emptyTestScores.length][emptyTestScores[0].length];
    for (int i = 0; i < emptyTestScores.length; i++) {
      for (int j = 0; j < emptyTestScores[i].length; j++) {
        testScores[i][j] = (int) (Math.random() * 41) + 60;
      }
    }
    return testScores;
  }

  public static void printScores(int[][] testScores) {
    for (int[] student : testScores) {
      for (int score : student) {
        System.out.print(score + " ");
      }
      System.out.println();
    }
  }

  public static void printAverages(int[][] testScores) {
    for (int i = 0; i < testScores.length; i++) {
      double sum = 0;
      for (int score : testScores[i]) sum += score;

      System.out.println("Student Average #" + (i+1)+ ": "+ (sum / testScores[i].length));
    }
  }

  public static boolean[] isImproving(int[][] testScores) {
    boolean[] isImproving = new boolean[testScores.length];
    for (int i = 0; i < testScores.length; i++) {
      isImproving[i] = true;
      int prev = 0;
      for (int j = 0; j < testScores[i].length; j++) {
        if (testScores[i][j] <= prev) {
          isImproving[i] = false;
          break;
        }
        prev = testScores[i][j];
      }
    }
    return isImproving;
  }

  public static void printIsImproving(boolean[] isImprovingList) {
    for (int i = 0; i < isImprovingList.length; i++) {
      System.out.println("Student #" + (i+1) + " is improving: " + isImprovingList[i]);
    }
  }
  public static void printColumnAverages(int[][] testScores) {
    int numRows = testScores.length;
    int numCols = testScores[0].length;

    for (int j = 0; j < numCols; j++) {
      double sum = 0.0;
      for (int[] testScore : testScores) {
        sum += testScore[j];
      }
      double average = sum / numRows;
      System.out.println("Column " + j + " average: " + average);
    }
  }
}
