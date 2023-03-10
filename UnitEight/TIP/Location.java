package UnitEight.TIP;

public class Location {
  private int row;
  private int col;
  private final int MAX_GRID_SIZE = 500;

  // Constructor with no arguments, sets row and col to 0
  public Location() {
    this.row = 0;
    this.col = 0;
  }

  // Constructor that sets row and col to the given values
  public Location(int r, int c) {
    setRow(r); // set row to r
    setCol(c); // set col to c
  }

  // Getter for row
  public int getRow() {
    return row;
  }

  // Getter for col
  public int getCol() {
    return col;
  }

  // Setter for row that validates the input
  public void setRow(int r) {
    if (r >= 0 && r < MAX_GRID_SIZE) {
      row = r; // set row to r if r is valid
    } else {
      System.out.println("Invalid row value"); // print error message if r is invalid
    }
  }

  // Setter for col that validates the input
  public void setCol(int c) {
    if (c >= 0 && c < MAX_GRID_SIZE) {
      col = c; // set col to c if c is valid
    } else {
      System.out.println("Invalid column value"); // print error message if c is invalid
    }
  }

  // Returns a string representation of the Location object
  public String toString() {
    return "(" + row + ", " + col + ")"; // returns the string representation of the Location object in the format (row, col)
  }
}