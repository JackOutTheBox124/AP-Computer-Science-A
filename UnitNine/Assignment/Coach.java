package UnitNine.Assignment;

class Coach extends Person {
    // instance variable
    private String role;

    // class constructor
    public Coach(String firstName, String lastName, String role) {
        // call superclass constructor to create Person object
        super(firstName, lastName);
        // initialize instance variable
        this.role = role;
    }

    public String toString() {
        return super.toString() + "\n   Role: " + role;
    }
}