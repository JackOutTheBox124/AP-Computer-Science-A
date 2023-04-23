package UnitNine.ClassInstruction.Factorial;

public class Iterative {
    public static void main(String[] args) {

        System.out.println("Factorial of 6 is " + factorial(6));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
