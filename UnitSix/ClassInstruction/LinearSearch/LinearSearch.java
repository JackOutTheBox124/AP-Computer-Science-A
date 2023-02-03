package UnitSix.ClassInstruction.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] list = {20, 10, 50, 40, 50};
    System.out.println("Enter a number to search for: ");
    int num = scan.nextInt();

    int index = linearSearch(list, num);

    if (index == -1) {
      System.out.println(num + " was not found in the list.");
    } else {
      System.out.println(num + " was found at index " + index + " in the list.");
    }
    
  }

  public static int linearSearch(int[] list, int num) {
    int where = -1;
    for (int i = 0; i < list.length; i++) {
      if (list[i] == num) {
        where = i;
        break;
      }
    }
    return where;
  }
}
