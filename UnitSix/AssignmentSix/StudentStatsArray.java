package UnitSix.AssignmentSix;

public class StudentStatsArray {

  // Add private final variable to hold Students array
  private final Student[] students;

  public StudentStatsArray(Student[] students) {
    this.students = students;
  }

  // Returns the average gpa of the students
  public double averageGpa() {
    double total = 0;
    for (Student student : students) {
      total += student.getGpa();
    }
    //calculating the average and returning it
    return (total / students.length);
  }

  // Returns the gpa range of the students
  public double getGpaRange() {
    double max = 0;
    double min = 4;
    //iterating through the students and getting max and min gpa
    for (Student s: students) {
      double gpa = s.getGpa();
      max = Math.max(max, gpa);
      min = Math.min(min, gpa);
    }
    //returning the range
    return max - min;
  }

  // Returns the name of the student that has the longest length
  public String getLongestName() {
    String longest = "";
    for (Student student: students) {
      String name = student.getName();
      //comparing the length of name with the longest name
      if (name.length() > longest.length()) {
        longest = name;
      }
    }
    return longest;
  }

  // Returns a count of the number freshman students
  public int getNumFreshman() {
    int count = 0;
    for (Student student: students) {
      //if student is in 1st year increment count
      if (student.getYear() == 1) {
        count++;
      }
    }
    return count;
  }

  // Returns the index of the first student with a name equal to name.
  // Returns -1 if not found
  public int search(String name) {
    for (int i = 0; i < students.length; i++) {
      if (students[i].getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }

  // Returns the index of the first student with a gpa greater than or equal to the gpa
  // Returns -1 if not found
  public int search(double gpa) {
    for (int i = 0; i < students.length; i++) {
      if (students[i].getGpa() >= gpa) {
        return i;
      }
    }
    return -1;
  }

  // Returns 1 if the students are sorted in ascending order by their gpa; -1 if they
  // are sorted in descending order; 0 otherwise.
  public int sortStatus() {
    boolean increasing = true;
    boolean decreasing = true;

    for (int i = 1; i < students.length; i++) {
      double current = students[i].getGpa();
      double last = students[i - 1].getGpa();
      if (current > last) {
        decreasing = false;
      }
      if (current < last) {
        increasing = false;
      }

    }
    //checking if the array is sorted in increasing or decreasing order
    // if increasing is true, return 1, else if decreasing is true, return -1, otherwise return 0
    return increasing ? 1 : decreasing ? -1 : 0;
  }

  // Returns the array of students in JSON like format
  public String toString() {
    StringBuilder result = new StringBuilder("[\n" + students[0]);
    //iterating through the students array and concatenating their toString representation
    for (int i = 1; i < students.length; i++) {
      result.append(",\n…\n").append(students[i]).append(",");
    }
    return result + "\n]";
  }
}