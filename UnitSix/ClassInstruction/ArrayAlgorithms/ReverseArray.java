package UnitSix.ClassInstruction.ArrayAlgorithms;

import java.util.Random;

public class ReverseArray {
  public static void main(String[] args) {
    // Initialize array with 10 random integers between 1 and 100
    int[] arr = new int[10];
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(100) + 1;
    }

    // Print array before reversing
    System.out.print("Original array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    // Reverse array elements
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }

    // Print array after reversing
    System.out.print("Reversed array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}