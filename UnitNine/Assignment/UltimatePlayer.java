package UnitNine.Assignment;

class UltimatePlayer extends Person {
    // class variable
    private static int jerseyNumberCounter = 1;
    // instance variables
    private int jerseyNumber;
    private String position;
    // class constructor
    public UltimatePlayer(String firstName, String lastName, String position) {
        // call superclass constructor to create Person object
        super(firstName, lastName);
        // initialize instance variables
        // if position is not "handler" or "cutter", set to "handler"
        this.position = position.equals("handler") || position.equals("cutter") ? position : "handler";
        // set jersey number to current jersey number counter value and increment counter by 1 to prevent duplicate jersey numbers
        this.jerseyNumber = jerseyNumberCounter++;
    }
    public String getPosition() {
        return position;
    }

    public int throwDisc(int pow) {
        return Math.min(Math.max(pow, 1), 10) * 4;
    }
    public String toString() {
        return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    }
}