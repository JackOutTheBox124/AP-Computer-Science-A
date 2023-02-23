package UnitEight.LessonOne.U8_L1_Activity_One;

/**
 * Write a public static method sumOfDiag, which takes a 2d array of int values as an input, and returns the sum of the elements in the lead diagonal as an int value. The lead diagonal is defined as the diagonal line of values starting in the top left corner and proceeding one step right and down for each value until either the bottom or right edge of the array is reached. For example, in the array represented below, the numbers in red make up the lead diagonal.
 *
 * Write your sumOfDiag method in the U8_L1_Activity_One class. Use the runner class to test your method but do not add a main method to your U8_L1_Activity_One.java file or your code will not be scored correctly.
 *
 * Hint - think about what the row/column indices are for each element in the lead diagonal of the array above. What is the link between the two indices for each element?
 */
// +---+---+---+---+
// |(8)| 7 | 5 | 8 |
// +---+---+---+---+
// | 1 |(3)| 9 | 5 |
// +---+---+---+---+
// | 3 | 4 |(6)| 2 |
// +---+---+---+---+

public class U8_L1_Activity_One {
  public static int sumOfDiag(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length && i < arr[0].length; i++) {
      sum += arr[i][i];
    }
    return sum;
  }
}
