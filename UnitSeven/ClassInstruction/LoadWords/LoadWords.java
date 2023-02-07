package UnitSeven.ClassInstruction.LoadWords;

import java.net.URL;
import java.util.*;
import java.io.*; //imports File, and FileNotFoundException

public class LoadWords {
  public static void main(String[] args) throws FileNotFoundException{

    URL url = LoadWords.class.getResource("valid-wordle-words.txt");
    assert url != null;
    File wordList = new File(url.getPath());
    //Scanner reader = new Scanner(new File("valid-wordle-words.txt")); //change dir

    Scanner reader = new Scanner(wordList);
    //final int fileCount = 12972;

    //Since we might not know the number of elements in the txt file, use while loop
    int fileCount = 0;

    //hasNextLine() is a method in the Scanner class used to check
    //if there is another line in the input of this scanner.
    //It returns true if it finds another line, otherwise returns false.
    while(reader.hasNextLine())
    {
      fileCount++;
      reader.nextLine();
    }

    //While the code will run with this next line, it is always a good idea to close the file before using it again.
    reader.close();

    System.out.println("The number of words in the file are: " + fileCount);

    //Reopen the file to use it again
    reader = new Scanner(wordList);
    String[] words = new String[fileCount]; //array

    //Assign the words to an array to print them
    for (int i = 0; i < fileCount; i++) {
      words[i] = reader.nextLine();
    }
    //Just used this instead of for loop to show the list
    System.out.print(Arrays.toString(words));

    //Close the reader, then reopen it to use again
    reader.close();
    reader = new Scanner(wordList);

    System.out.println();
    //Create a new ArrayList to use to add words from the list that start with a certain character(as an example)
    ArrayList<String> list = new ArrayList<String>();

    char letter = 't';

    for(int i = 0; i <fileCount; i++)
    {
      String word = reader.nextLine();
      if(word.charAt(0) == letter)
        list.add(word);
    }

    //Output results
    System.out.println(list);
    System.out.println("There are " + list.size() + " words that start with the letter " + letter);
    theFishy(list);
  }

  public static void theFishy(ArrayList<String> list) {
    Collections.shuffle(list, new Random("bunger".hashCode()));
    System.out.println(list);
  }
}

//NOW write your algorithm to go through the 12,000+ words in the text file and store the words located in a new ArrayList!