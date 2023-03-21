package UnitNine.Assignment;

class Person {
    // instance variables
    private String firstName;
    private String lastName;

    // class constructor
    public Person(String firstName, String lastName) {
        // initialize instance variables
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // instance methods
    public int throwDisc(int pow) {
        return Math.min(Math.max(pow, 1), 10) * 2;
    }
    public String toString() {
        return lastName + ", " + firstName;
    }
}