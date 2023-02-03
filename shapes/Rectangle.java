package shapes;

/** Represents a rectangle. Every rectangle created using this class has a positive length and width. */
 public class Rectangle {
  private double length;
  private double width;

  /** Creates a rectangle with length and width both of 1.0. */
  public Rectangle() {
    setLength(1.0);
    setWidth(1.0);
  }

  /**
   * Creates a rectangle with length and width both of the given value.
   *
   * @param len The length and width of the new rectangle. This should be a positive number.
   */
  public Rectangle(double len) {
    setLength(len);
    setWidth(len);
  }

  /**
   * Creates a rectangle with length and width of the given values.
   *
   * @param len The length of the new rectangle. This should be a positive number.
   * @param wid The width of the new rectangle. This should be a positive number.
   */
  public Rectangle(double len, double wid) {
    setLength(len);
    setWidth(wid);
  }

  /**
   * Sets the length of the rectangle to the specified length.
   *
   * @param len the proposed new length. This should be a positive number.
   */
  public void setLength(double len) {
    if (len <= 0) {
      throw new IllegalArgumentException("The length of a rectangle must be positive");
    }
    else length = len;
  }

  /**
   * Sets the width of the rectangle to the specified width.
   *
   * @param wid the proposed new width. This should be a positive number.
   */
  public void setWidth(double wid) {
    if (wid <= 0) {
      throw new IllegalArgumentException("The width of a rectangle must be positive");
    } else width = wid;
  }

  /**
   * Used to get the length of the rectangle, which will be a positive number.
   *
   * @return the length of the rectangle.
   */
  public double getLength() {
    return length;
  }

  /**
   * Used to get the width of the rectangle, which will be a positive number.
   *
   * @return the width of the rectangle.
   */
  public double getWidth() {
    return width;
  }

  /**
   * Calculates the area of this rectangle as a double.
   *
   * @return the area of the rectangle.
   */
  public double getArea() {
    return length * width;
  }

  /**
   * Calculates the perimeter of this rectangle as a double.
   *
   * @return the perimeter of the rectangle.
   */
  public double getPerimeter() {
    return 2 * (length + width);
  }

  /**
   * Compares this rectangle to the specified object. The result is true if and only if the argument is not null and is a Rectangle object with the same length and width as this object.
   *
   * @param anObject the reference object with which to compare.
   * @return true if the given object represents a Rectangle with the same length and width as this one, false otherwise.
   */
  @Override
  public boolean equals(java.lang.Object anObject) {
    if(anObject.getClass() == Rectangle.class) {
      return (((Rectangle) anObject).getLength() == length) &&
              (((Rectangle) anObject).getWidth() == width);
    }
    return false;
  }

  /**
   * A String representation of this rectangle. This is in the form "rectangle with length l, width w", where l and w are the doubles representing the length and width of the rectangle to the nearest hundredth.
   *
   * @return a String representation of this rectangle.
   */
  @Override
  public java.lang.String toString() {
    return "rectangle with length " + (Math.floor(length * 100) / 100) +
            ", width " + (Math.floor(width * 100) / 100);
  }
}
