package UnitSeven.TIP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MethodArrayPractice {
  //REMOVE METHOD
  public static void remove(ArrayList<String> list, char letter) {
    for (int i = list.size()-1; i >= 0; i--) {
      if (list.get(i).charAt(0) == letter) {
        list.remove(i);
      }
    }
  }

  //CAPS METHOD
  public static void caps(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
      list.set(i, s);
    }
  }

  //ALPHABETIZE THE LIST
  public static ArrayList<String> alphabetize(ArrayList<String> list) {
    ArrayList<String> result = new ArrayList<>(list);
    Collections.sort(result);

    // other ways lol

    // result.sort(String::compareTo);

    // for (int i = 0; i < result.size() - 1; i++) {
    //   for (int j = i + 1; j < result.size(); j++) {
    //     if (result.get(i).compareTo(result.get(j)) > 0) {
    //       String temp = result.get(i);
    //       result.set(i, result.get(j));
    //       result.set(j, temp);
    //     }
    //   }
    // }

    return result;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //CREATE THE ARRAYLIST OBJECT
    ArrayList<String> list = new ArrayList<>();

    //INITIALIZE THE ARRAYLIST
    System.out.println("Enter words, type 'STOP' to finish:");
    String word = scan.next();
    while (!word.equals("STOP")) {
      list.add(word);
      word = scan.next();
    }

    //PRINT THE ORIGINAL LIST
    System.out.println("\nOriginal List:");
    for(String s : list) {
      System.out.println(s);
    }
    // System.out.println("\t" + list);

    //REQUEST USER INPUT FOR THE "REMOVE" METHOD
    System.out.println("\nEnter a character to remove all the words in the ArrayList beginning with this letter:");
    char letter = scan.next().charAt(0);
    System.out.println("letter: " + letter);

    //CALL THE "REMOVE" METHOD AND PRINT THE NEW LIST
    remove(list, letter);
    System.out.println("\nList after removing words starting with " + letter + ":");
    for(String s : list) {
      System.out.println(s);
    }

    //CALL THE "ALPHABETIZE" METHOD
    ArrayList<String> alphabetized = alphabetize(list);

    //CALL THE "CAPS" METHOD that PRINT THE NEW LIST
    caps(list);
    System.out.println("\nList after capitalizing words:");
    for(String s : list) {
      System.out.println(s);
    }

    //PRINT THE ALPHABETIZED LIST
    System.out.println("\nAlphabetized List:");
    for (String s : alphabetized) {
      System.out.println(s);
    }
  }
}
