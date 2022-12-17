package UnitFive.LessonSix.U5_L6_Coding_Activity;

/**
 * Your class will build a vehicle and keep track of its location on the road. Location values may range from -2000 to 2000. A location value of 0 represents 0 feet, a location value of 100 represents 100 feet, a location value of 200 represents 200 feet, etc. The value of 0 just means the starting position, not actually 0 feet from sea level. If the user tries to move the vehicle beyond block +2000 or -2000, set the location to +/- 2000 respectively.
 */
public class Plane {
  private int location;

  /** Sets location to 0. */
  public Plane() {
    location = 0;
  }

  /**
   * If loc is between -2000 and 2000 inclusive, sets location to loc. Otherwise, sets location to 0.
   *
   * @param loc location of plane in feet.
   */
  public Plane(int loc) {
    location = (-2000 <= loc && loc <= 2000) ? loc : 0;
  }

  /** Increments the plane upward 100 feet. */
  public void upward() {
    location = Math.min(location + 100, 2000);
  }

  /** Increments the vehicle downward 100 feet. */
  public void downward() {
    location = Math.max(location - 100, -2000);
  }

  /**
   * Returns an integer representing the location of the plane.
   * @return an integer representing the location of the plane.
   */
  public int getLocation() {
    return location;
  }

  /**
   * Returns a {@link java.lang.String String} representation showing the plane as an {@code @} character, with spaces to show its location. When the vehicle is at location -2000 the @ character appears at the start of the String. When the plane is at a higher position, one space for each number from -2000 to the plane's current location appears before the @. For example if the plane is at -1000 feet, the method will return {@code "          @"} (10 spaces then the '@'). If the car is at 500 feet the method will return {@code "                         @"} (25 spaces then the '@').
   * @return a {@link java.lang.String String} representation showing the plane as an @ character, with spaces to show its location.
   */
  @Override
  public String toString () {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < location / 100 + 20; i++) {
      str.append(" ");
    }
    return str.append("@").toString();
  }
}