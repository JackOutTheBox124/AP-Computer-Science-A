package UnitFive.LessonSeven.U5_L7_Coding_Activity;

/** Represents a rectangle. Every rectangle created using this class has a base (or length) and a height (or width). */
public class Rectangle {
  private double base;
  private double height;

  /** Creates a rectangle with base and height both of length 1.0. */
  public Rectangle() {
    setBase(1.0);
    setHeight(1.0);
  }

  /**
   * Creates a rectangle with base of bs and height of ht if these are positive.
   *
   * @param bs The proposed base of the new rectangle. This should be a positive number.
   * @param ht The proposed height of the new rectangle. This should be a positive number.
   */
  public Rectangle(double bs, double ht) {
    setBase(bs > 0 ? bs : 1.0);
    setHeight(ht > 0 ? ht : 1.0);
  }

  /**
   * Sets the base of the rectangle to the specified length.
   *
   * @param bs the proposed new base. This should be a positive number.
   */
  public void setBase(double bs) {
    if(bs > 0) base = bs;
  }

  /**
   * Sets the height of the rectangle to the specified length.
   *
   * @param ht the proposed new height. This should be a positive number.
   */
  public void setHeight(double ht) {
    if (ht > 0) height = ht;
  }

  /**
   * Used to get the base of the rectangle as a double.
   *
   * @return the height of the rectangle.
   */
  public double getBase() {
    return base;
  }

  /**
   * Used to get the height of the rectangle as a double.
   *
   * @return the height of the rectangle.
   */
  public double getHeight() {
    return height;
  }

  /**
   * Calculates the length the diagonal of the rectangle and returns this as a double.
   *
   * @return the diagonal of the rectangle.
   */
  public double getDiagonal() {
    return Math.hypot(base, height);
  }

  /**
   * Calculates the area of this rectangle as a double.
   *
   * @return the area of the rectangle.
   */
  public double getArea() {
    return base * height;
  }

  /**
   * Calculates the perimeter of this rectangle as a double.
   *
   * @return the perimeter of the rectangle.
   */
  public double getPerimeter() {
    return base + base + height + height;
  }

  /**
   * Compares this rectangle to the other.
   *
   * @param other The other rectangle to compare.
   * @return true if the other rectangle has the same base and height as this one, false otherwise.
   */
  public boolean equals(Rectangle other) {
    return other.getBase() == base && other.getHeight() == height;
  }

  /**
   * A String representation of this rectangle. This is in the form "rectangle with base a, height b, where a and b are the doubles representing the base and height of the rectangle.
   *
   * @return a String representation of this rectangle.
   */
  @Override
  public String toString() {
    return "rectangle with base " + base + ", height " + height;
  }

}