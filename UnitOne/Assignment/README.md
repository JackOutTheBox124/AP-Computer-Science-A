# Assignment 1: Calculating Grades
For this assignment, you will write a program to calculate a student's final course grade based on the student's homework, quiz, and final exam scores.

The first input to the program will be the name of the course (as a string), followed by the average amount of time the student spent on the course per week in minutes (as an int). Then, the program will then read 4 integers representing the student's homework scores, 2 decimals representing the student's quiz scores, and finally, a decimal representing the student's final exam score.

The program should then output the course name and the average time spent for the course in a week in hours and minutes. This should be followed by the average homework grade, the average quiz grade, and the final exam grade (as doubles), and an overall grade (as an int).

The overall grade should be computed as a weighted average. The weights are as follows:

* Average homework grade - 35%
* Average quiz grade - 15%
* Final exam grade - 50%

The overall grade should be rounded to the nearest integer (NOT just truncated to the integer below).

When you write the code to produce your program's final output, take extra care to ensure all the labels used are exactly as shown in the sample run, including the colon after each label. The program which grades your solution will look for the values after these labels, so if they don't match exactly your solution may not be graded correctly.

**Sample Run:**
<pre>
Please enter the course name.
AP Computer Science A
Please enter the average time spent in a week for this course in minutes.
135
Please enter the homework grades for this course.
75
99
80
100
Please enter the quiz grades for this course.
89.2
98.1
Please enter the final exam grade for this course.
87.58
Course name: AP Computer Science A
Weekly time spent: 2h15
Average homework grade: 88.5
Average quiz grade: 93.65
Final exam grade: 87.58
Overall grade: 89
</pre>

# Milestones
As you work on this assignment, you can use the milestones below to inform your development process:

**Milestone 1:** Create code that prompts the user for input, taking a String for the course name and an int for the weekly time spent on the course. Write code that displays this course name and the number of hours and minutes from the total number of minutes.

**Milestone 2:** Write code for four int inputs (homework), followed by a pair of doubles (quizzes) and a single double (final exam). All of these should be stored in appropriate variables.

**Milestone 3:** Calculate and display (as doubles) the average of the homework grades, the average of the two quiz grades and the single final exam grade. Hint: store the averages calculated as variables so you don’t need to calculate them again later.

**Milestone 4:** Calculate and display the weighted average of the three different average figures.

**NOTE: You MUST use the class name "Assignment1" for this assignment. REMEMBER: you must CHECK your code and SUBMIT your answer. Your assignment doesn't count as complete unless it has been submitted.**