package UnitSeven.Lab;

public class InsertionSort {
  public static void insertSort(int [] a) {
//DECLARING VARIABLES TO MAKE METHOD EASIER TO READ
    int pointer;
    int valueToSort;  //using this like a temp variable

//START THE POINTER AT POSITION 1 AND LOOK BACKWARDS USING 2ND LOOP
    //REMEMBER: OUTSIDE LOOP IS USED TO KEEP TRACK OF THE CURRENT POSITION AND REASSIGN THE POINTER

    for(int i = 1; i < a.length; i++) {
      pointer = i;
      valueToSort = a[i];

      /* WHILE GOING BACKWARDS, KEEP COMPARING THE valueToSort WITH THE PREVIOUS VALUE
       * UNTIL WE FIND A GREATER VALUE OR WE GET TO THE START.
       */

      while (pointer > 0 && a[pointer-1] >= valueToSort) {
        a[pointer] = a[pointer -1];
        pointer --;
      }

      a[pointer] = valueToSort;

      //Print the array after each iteration for demo purposes ONLY

      System.out.print("\nList after pass #" + (i ) + ": ");
      for (int j : a) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  //MAIN METHOD TO CALL THE insertSort method
  public static void main (String [] args) {
    int [] array = {56, 34, 55, 12, 88, 37, 45, 21};
    //int [] array = {67, 46, 72, 62, 24, 50};

//ORIGINAL ARRAY - PRINT
    System.out.print("Original Array: \t");
    for (int j : array) {
      System.out.print(j + " ");
    }

//SORTED ARRAY - PRINT
    System.out.print("\n\nSorted Array: \t");
    insertSort(array);
  }
}