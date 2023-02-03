package UnitSix.ClassInstruction.ArrayAlgorithms;

import java.util.Random;
import java.util.Scanner;

public class DeleteElement {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[10];

    // Initialize array with 10 random integers between 1 and 100
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(100) + 1;
    }

    // Print array before deleting
    System.out.print("Original Array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("What position would you like to delete?");
    int pos = scan.nextInt();

    // Delete element at index pos
    for (int i = pos; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = 0;

    // Print the updated array
    System.out.print("Updated Array: ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
