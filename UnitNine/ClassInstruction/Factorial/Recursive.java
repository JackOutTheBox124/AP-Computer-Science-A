package UnitNine.ClassInstruction.Factorial;

public class Recursive {
  public static void main(String[] args) {
    System.out.println("Factorial of 6 is " + factorial(6));
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
