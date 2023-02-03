package UnitSeven.ClassInstruction;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAlgorithms {
  public static void main(String[] args) {
    ArrayList<String> sports = new ArrayList<String>();

    sports.add("football");
    sports.add("tennis");
    sports.add("baseball");
    sports.add("hockey");
    sports.add("wrestling");
    sports.add("lacrosse");


    // print out only sports that contain l
    // for (String sport: sports) {
    //   if (sport.contains("l")) {
    //     System.out.println(sport);
    //   }
    // }

    // reverse the order of the sports arraylist

    // i have been silenced by the media and forced to not use the Collections.reverse() method :(
    // literally just like George Orwell's 1949 novel "1984"
    // Collections.reverse(sports);

    for (int i = 0; i < sports.size(); i++) {
      sports.add(0, sports.remove(i));
    }
    for(String sport: sports) {
      System.out.println(sport);
    }

  }
}
