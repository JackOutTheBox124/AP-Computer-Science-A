package shapes;

/** Represents a Regular Polygon. Every shape created using this class has an integer number of sides greater than 3 all with the same length. */
 public class RegularPolygon extends java.lang.Object {
   private int sides;
   private double length;
   /** Creates an equilateral triangle with side length 1.0. */
    public RegularPolygon() {
    setNumSides(3);
    setSideLength(1.0);
  }
  /**
   * Creates a regular polygon with the given number of sides. Side lengths default to {@code 1.0}.
   *
   * @param num the number of sides in the polygon. This should be 3 or greater.
   */
  public RegularPolygon(int num) {
    setNumSides(num);
    setSideLength(1.0);
  }

  /**
   * Creates an equilateral triangle with the given side length.
   *
   * @param len the length of each side in the polygon. This should be positive.
   */
  public RegularPolygon(double len) {
    setNumSides(3);
    setSideLength(len);
  }

  /**
   * Creates a regular polygon with the given number of sides and side length.
   *
   * @param num the number of sides in the polygon. This should be 3 or greater.
   * @param len the length of each side in the polygon. This should be positive.
   */
  public RegularPolygon(int num, double len) {
    setNumSides(num);
    setSideLength(len);
  }

  /**
   * Sets the side length of the regular polygon to the specified length.
   *
   * @param len the proposed new side length. This should be a positive number.
   */
  public void setSideLength(double len) {
    if (len <= 0) {
      throw new IllegalArgumentException("The length of a side must be positive");
    } else length = len;
  }

  /**
   * Sets the number of sides of the regular polygon to the specified number.
   *
   * @param num the proposed new number of sides. This should be 3 or greater.
   */
  public void setNumSides(int num) {
    if (num < 3) {
      throw new IllegalArgumentException("The number of sides in a regular polygon must be 3 or greater");
    } else sides = num;
  }

  /**
   * Used to get the number of sides in the polygon.
   *
   * @return the number of sides in the regular polygon.
   */
  public int getNumSides() {
    return sides;
  }

  /**
   * Used to get the length of each side in the regular polygon.
   *
   * @return the side length of the regular polygon.
   */
  public double getSideLength() {
    return length;
  }

  /**
   * Calculates the area of this regular polygon as a double.
   *
   * @return the area of the regular polygon.
   */
  public double getArea() {
    return (sides * (length * length)) / (4.0 * Math.tan((Math.PI / sides)));
  }

  /**
   * Calculates the perimeter of this regular polygon as a double.
   *
   * @return the perimeter of the regular polygon.
   */
  public double getPerimeter() {
    return sides * length;
  }

  /**
   * Compares this regular polygon to the specified object. The result is true if and only if the argument is not null and represents a polygon with the same number of sides and side lengths as this one.
   *
   * @param anObject the reference object with which to compare.
   * @return true if the given object represents a Rectangle with the same length and width as this one, false otherwise.
   */
  @Override
  public boolean equals(java.lang.Object anObject) {
    if (anObject.getClass() == RegularPolygon.class) {
      return (((RegularPolygon) anObject).getNumSides() == sides) &&
              ((RegularPolygon) anObject).getSideLength() == length;
    }
    return false;
  }

  /** Increases the number of sides in the polygon by 1. The lengths of the sides in the polygon are unaffected, with the additional side having the same length as the others so the shape remains a regular polygon. */
  public void addSides() {
    setNumSides(sides + 1);
  }

  /**
   * Increases the number of sides in the polygon by 1. The lengths of the sides in the polygon are unaffected, with the additional side having the same length as the others so the shape remains a regular polygon.
   *
   * @param numExtra the number of sides to add to the polygon.
   */
  public void addSides(int numExtra) {
    setNumSides(sides + numExtra);
  }

  /**
   * A String representation of this regular polygon. The string returned is in the form "regular shape_name with side length l", where l is the length of each side, and shape_name is the correct polygon name for shapes between 5 and 20 sides inclusive. For shapes with more sides the phrase "polygon of n sides", where n is the number of sides, is used. For shapes of side 3 the string returned is "equilateral triangle with side length l", and for shapes of side 4 the string returned is "square with side length l".
   *
   * @return a String representation of this polygon.
   */
  @Override
  public java.lang.String toString() {
    StringBuilder str = new StringBuilder();
    switch (sides) {
      case 3:
        str.setLength(0);
        str.append("equilateral triangle");
        break;
      case 4:
        str.setLength(0);
        str.append("square");
        break;
      case 5:
        str.append("pentagon");
        break;
      case 6:
        str.append("hexagon");
        break;
      case 7:
        str.append("heptagon");
        break;
      case 8:
        str.append("octagon");
        break;
      case 9:
        str.append("nonagon");
        break;
      case 10:
        str.append("decagon");
        break;
      case 11:
        str.append("hendecagon");
        break;
      case 12:
        str.append("dodecagon");
        break;
      case 13:
        str.append("triskaidecagon");
        break;
      case 14:
        str.append("tetrakaidecagon");
        break;
      case 15:
        str.append("pentadecagon");
        break;
      case 16:
        str.append("hexadecagon");
        break;
      case 17:
        str.append("heptadecagon");
      break;
      case 18:
        str.append("octadecagon");
        break;
      case 19:
        str.append("enneadecagon");
        break;
      case 20:
        str.append("icosagon");
        break;
      default:
        str.append("polygon of ").append(sides).append(" sides");
        break;
    }
    return str.append(" with side length of ").append(length).toString();
  }
}
