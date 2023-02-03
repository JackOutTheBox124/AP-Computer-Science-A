package shapes;

/** Represents a circle. Every circle created using this class has a positive radius. */
public class Circle {
  private double radius;

  /** Creates a circle with a radius of {@code 1.0}. */
  public Circle() {
    radius = 1.0;
  }

  /** Creates a circle with the specified radius.  @param rad the rad  @param rad the rad */
  public Circle(double rad) {
    setRadius(rad);
  }


  /**
   * Sets the radius of the circle to the specified radius.
   *
   * @param rad the proposed new radius. This should be a positive number.
   */
  public void setRadius(double rad) {
    if (rad <= 0) {
      throw new IllegalArgumentException("The radius of a circle must be positive");
    }
    else radius = rad;
  }

  /**
   * Used to get the radius of the circle, which will be a positive number.
   *
   * @return the radius of the circle.
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Calculates the area of this circle as a double.
   *
   * @return the area of the circle.
   */
  public double getArea() {
    return Math.PI * (radius * radius);
  }

  /**
   * Calculates the circumference of this circle as a double.
   *
   * @return the circumference of the circle.
   */
  public double getCircumference() {
    return Math.PI * 2 * radius;
  }

  /**
   * Compares this circle to the specified object. The result is true if and only if the argument is not null and is a Circle object with the same radius as this object.
   * @param anObject the reference object with which to compare.
   * @return true if the given object represents a Circle with the same radius as this one, false otherwise.
   */
  @Override
  public boolean equals(java.lang.Object anObject) {
    if(anObject.getClass() == Circle.class) {
      return ((Circle) anObject).getRadius() == radius;
    }
    return false;
  }

  /**
   * A String representation of this circle. This is in the form "circle with radius r", where r is the double representing the radius of the circle to the nearest hundredth.
   * @return a String representation of this circle.
   */
  @Override
  public java.lang.String toString() {
    return "circle with radius " + radius;
  }
}
