package UnitEight.LessonOne.U8_L1_Activity_Two;

/**
 * Write a public static method named <code>productTable</code>
 * which returns a 2d array which represents a multiplication table.
 * Each element in the array should be equal to the product (multiplication) of the indices of the cell.
 * The method should take 2 parameters which are equal to the number of rows and number of columns
 * of the multiplication table. For example, the call <code>productTable(6, 5)</code> should return
 * the array represented by the table below:
 */
// +---+---+----+----+----+
// | 0 | 0 |  0 |  0 |  0 |
// +---+---+----+----+----+
// | 0 | 1 |  2 |  3 |  4 |
// +---+---+----+----+----+
// | 0 | 2 |  4 |  6 |  8 |
// +---+---+----+----+----+
// | 0 | 3 |  6 |  9 | 12 |
// +---+---+----+----+----+
// | 0 | 4 |  8 | 12 | 16 |
// +---+---+----+----+----+
// | 0 | 5 | 10 | 15 | 20 |
// +---+---+----+----+----+
public class U8_L1_Activity_Two {
  public static int[][] productTable(int rows, int cols) {
    int[][] table = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        table[i][j] = i * j;
      }
    }
    return table;
  }
}
