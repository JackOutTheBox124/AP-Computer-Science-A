## **PART 1 FRQ: Construct a response to the FRQ. Test, debug and make corrections as necessary.**
1. Handwrite your code your GameSpinner response
2. Submit your response in AP Classroom for the Unit 5 FRQ Exam
3. Type/copy your code into JGrasp and use the runner file to test your solution and make corrections.
4. Submit your corrected code `GameSpinner.java` to the GameSpinner class assignment on Google classroom.


**Notes:**

SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA.
- Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
- Unless otherwise noted in the question, assume that parameters in method calls are not `null` and that methods are called only when their preconditions are satisfied.
- In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.

This question involves the creation and use of a spinner to generate random numbers in a game. A `GameSpinner`
This question involves the creation and use of a spinner to generate random numbers in a game.
A `GameSpinner` object represents a spinner with a given number of sectors, all equal in size.
The GameSpinner class supports the following behaviors.
- Creating a new spinner with a specified number of sectors
- Spinning a spinner and reporting the result
- Reporting the length of the current run, the number of consecutive spins that are the same as the most recent spin

The following table contains a sample code execution sequence and the corresponding results. 


| Statements                            | Value Returned (blank if no value returned) | Comment                                                                                                                               |
|---------------------------------------|---------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|
| `GameSpinner g = new GameSpinner(4);` |                                             | Creates a new spinner with four sectors                                                                                               |
| `g.currentRun();`                     | 0                                           | Returns the length of the current run. The length of the current run is initially `0` because no spins have occurred.                 |
| `g.spin();`                           | 3                                           | Returns a random integer between `1` and `4`, inclusive. In this case, `3` is returned.                                               |
| `g.currentRun();`                     | 1                                           | The length of the current run is `1` because there has been one spin of `3` so far.                                                   |
| `g.spin();`                           | 3                                           | Returns a random integer between `1` and `4`, inclusive. In this case, `3` is returned.                                               |
| `g.currentRun();`                     | 2                                           | The length of the current run is `2` because there have been two `3`s in a row.                                                       |
| `g.spin();`                           | 4                                           | Returns a random integer between `1` and `4`, inclusive. In this case, `4` is returned.                                               |
| `g.currentRun();`                     | 1                                           | The length of the current run is `1` because the spin of `4` is different from the value of the spin in the previous run of two `3`s. |
| `g.spin();`                           | 3                                           | Returns a random integer between `1` and `4`, inclusive. In this case, `3` is returned.                                               |
| `g.currentRun();`                     | 1                                           | The length of the current run is `1` because the spin of `3` is different from the value of the spin in the previous run of one `4`.  |
| `g.spin();`                           | 1                                           | Returns a random integer between `1` and `4`, inclusive. In this case, `1` is returned.                                               |
| `g.spin();`                           | 1                                           | Returns a random integer between `1` and `4`, inclusive. In this case, `1` is returned.                                               |
| `g.spin();`                           | 1                                           | Returns a random integer between `1` and `4`, inclusive. In this case, `1` is returned.                                               |
| `g.currentRun();`                     | 3                                           | The length of the current run is `3` because there have been three consecutive `1`s since the previous run of one `3`.                |


## **PART 2 LAB: Create your OWN class that creates and uses objects of the `GameSpinner` data type.**

The class should be some sort of game that uses more than one GameSpinner object. For example, you can make a slot machine that uses 3 GameSpinner objects, and if the value of all 3 match after a spin,  then the user wins a jackpot. Incorporate a loop by asking the user how many times they want to spin.

OR you can spin several times (using a loop!!) and if your `currentRun()` values tally over a certain amount (that is, if you spin 10 times and the total of matching consecutive spins tallys over 20, then they win a jackpot). USE YOUR IMAGINATION!!

To review for the AP exam, this lab must meet the following specifications in the evaluation chart below.


More than ONE GameSpinner object is created and used
2
There is one or more calls to the spin() method on  GameSpinner object(s)
2
There is one or more calls to the currentRun() method on  GameSpinner object(s)
2
Some loop is used (to ask user to play/spin again, to assign random values to a certain number of spins, both?)
2
A static method is created and called within your unique game class. This method can be something as simple as printing your list of objects (in an array/ArrayList if used).
3
Your game should be intuitive to RUN. I should not have to guess what to enter!! Give me prompts/directions in your code!
2
Your classes are commented. Each method should have a description of WHAT the method is intended to do.
2
EXTENSION: An array or ArrayList can be used in some capacity. Arrays can store primitives (ints, booleans, doubles) or objects (Strings, GameSpinners) but is NOT resizeable. An ArrayList can only store objects (Integer, Boolean, Double, GameSpinners) but is resizeable.
WE HAVE NOT LEARNED THESE DATA TYPES YET. But some of you already know how to use these, so GO FOR IT!


| TOTAL                                                                                                                                                                                                                                                                                                                                                                                              | 15 pts |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------|
| More than ONE GameSpinner object is created and used                                                                                                                                                                                                                                                                                                                                               | 2      |
| There is one or more calls to the spin() method on  GameSpinner object(s)                                                                                                                                                                                                                                                                                                                          | 2      |
| There is one or more calls to the currentRun() method on  GameSpinner object(s)                                                                                                                                                                                                                                                                                                                    | 2      |
| Some loop is used (to ask user to play/spin again, to assign random values to a certain number of spins, both?)                                                                                                                                                                                                                                                                                    | 2      |
| A static method is created and called within your unique game class. This method can be something as simple as printing your list of objects (in an array/ArrayList if used).                                                                                                                                                                                                                      | 3      |
| Your game should be intuitive to RUN. I should not have to guess what to enter!! Give me prompts/directions in your code!                                                                                                                                                                                                                                                                          | 2      |
| Your classes are commented. Each method should have a description of WHAT the method is intended to do.                                                                                                                                                                                                                                                                                            | 2      |
| EXTENSION: An array or ArrayList can be used in some capacity. Arrays can store primitives (ints, booleans, doubles) or objects (Strings, GameSpinners) but is NOT resizeable. An ArrayList can only store objects (Integer, Boolean, Double, GameSpinners) but is resizeable. <br /><br /> WE HAVE NOT LEARNED THESE DATA TYPES YET. But some of you already know how to use these, so GO FOR IT! |        |