# Assignment 6: Array Statistics

For this assignment, you will complete a class which will be used to find statistics on an array of Student objects.
The class, **StudentStatsArray, needs to store an array of Student objects as a member variable. This should be declared as private and final, so none of your methods will set this variable to point at a different array. The single constructor for this class has a parameter of a Student array, and should set the member variable to point to this parameter array.

The member variables and methods of the Student class are as follows:

Variables
String name - the name of the student
double gpa - the student's GPA (0-4.0 inclusive)
int year - the student's year (1-4 inclusive)
Methods
String getName() - returns the name of this student
double getGpa() - returns the GPA of this student
int getYear() - returns this students year
String toString () - return a String representing this student in a JSON like format, which is as follows:
{
name: <student's name>,
gpa: <student's gpa>,
year: <student's year>
}
After inspecting the code for the Student class, you will need to complete the following methods in the StudentStatsArray class (you may assume that the member variable array is not empty when writing these methods):

Variables
Student[] students - the array of student objects
Methods
double averageGpa() - returns the average GPA of the student's in the students array
double getGpaRange() - returns the range of the GPAs of the student's in the students array
String getLongestName() - returns the name of the student with the longest name in the students array
int getNumFreshman() - returns the number of freshman (year = 1) in the students array
int search(String name) - returns the index of the first student with a name equal to name. If there are no students with a name equal to name, the method should return -1.
int search(int gpa) - return the index of the first student with a gpa greater than or equal to gpa. If there are no students with a gpa greater than or equal to gpa, the method should return -1.
int sortStatus() - returns 1 if the students are sorted in ascending order by their gpa; -1 if in descending order; 0 otherwise.
String toString() - returns a string representing the students array in a format similar to JSON. The format is as follows:
[
{
name: <student[0] name>,
gpa: <student[0] gpa>,
year: <student[0] year>
},
…
{
name: <student[length -1] name>,
gpa: <student[length - 1] gpa>,
year: <student[length - 1] year>
},
]        
You should use the runner_StudentStatsArray class to test your classes. Do not add a main method to the Student.java or StudentStatsArray.java files, as it will cause your submission to be scored incorrectly.

Remember not to have spaces between your brackets, as a space will also cause your submission to be scored incorrectly.

Milestones
As you work on this assignment, you can use the milestones below to inform your development process:

Milestone 1: Add the Student array member variable to the StudentStatsArray class and complete the constructor. Write the toString method for the class and test that it formats the output string in the exact format described.

Milestone 2: Add both of the overloaded search methods. The first, to search a Student by their name and the second to search for a student by their gpa, returning the index of the Student or -1 if no student is found.

Milestone 3: Add both the getNumFreshman and getLongestName methods to the StudentStatsArray class. The first method, getNumFreshman, should return the number of students with year = 1. The second method, getLongestName, should use a loop to keep track of the student with the longest name, and return the name of the longest student.

Milestone 4: Write a loop in the average method which sums the values, then use this to return the average. Write a loop to iterate through the array and find the minimum/maximum GPA of the students in the range method, then use these values to calculate and return the range of GPAs.

Milestone 5: Implement the sortStatus function checks if the students are sorted in ascending or descending order by their GPAs.