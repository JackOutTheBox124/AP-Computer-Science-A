Methods and ArrayList Practice

NOTE: A template for this activity is attached to this Google Classroom assignment:
`MethodArrayPractice_TEMPLATE.java`


Write a program that allows a user input words at the command line.
The program should stop accepting words when the user enters “STOP”.
Store the words in an ArrayList,
but the word “STOP” should not be stored in the list.
Print the original list you entered on a new line and tabbed in once.


<ol type="1">
   <li>
      Next, write a method called remove that accepts one ArrayList<String> parameter and one char parameter.
      (HINT: there is no “scan.nextChar()” method to accept user input for ONE char.
      A workaround is this: <code>char letter = scan.next().charAt(0)</code>.
      That way this assigns only the first letter of whatever string you enter into the char letter box.)
      <ol>
         <li>
            Go through the ArrayList and remove any String that begins with the character in the second parameter. The method does not need to return any values.
            Print the new ArrayList with the words that begin with that letter removed
         </li>
         <li>
            Next, write a method called caps that changes the first letter of every element in the ArrayList to a capital letter.
            This method should also print the list.
            Is this a void or return method??
         </li>
         <li>
            Next, write your OWN return method that returns something from the array list. Use a comment to tell us what the return method is supposed to be doing. In the sample run below, it shows an alphabetize method. You can try this or write your own!!
         </li>
      </ol>
    </li>

  <li>
      Next, write a method called caps that changes the first letter of every element in the ArrayList to a capital letter.
      <ol>
            <li>
                This method should also print the list.
            </li>
            <li>
                Is this a void or return method??
            </li>
      </ol>
      <li>
          b) Next, write your OWN return method that returns something from the array list. Use a comment to tell us what the return method is supposed to be doing. In the sample run below, it shows an alphabetize method. You can try this or write your own!!
      </li>

   </li>
</ol>
