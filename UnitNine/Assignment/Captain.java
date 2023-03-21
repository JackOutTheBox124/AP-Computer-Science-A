package UnitNine.Assignment;

class Captain extends UltimatePlayer {
    // instance variable
    private boolean type;

    // class constructor
    public Captain(String firstName, String lastName, String position, boolean type) {
        // call superclass constructor to create UltimatePlayer object
        super(firstName, lastName, position);
        // initialize instance variable
        this.type = type;
    }
    public int throwDisc(int pow) {
        return Math.min(Math.max(pow, 1), 10) * 5;

    }
    public String toString() {
        return super.toString() + "\n   Captain: " + (type ? "offense" : "defense");
    }
}