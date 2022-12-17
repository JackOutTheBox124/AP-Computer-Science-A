## Plane class
Create a class named `Plane` that simulates a plane moving up and down along 4000 feet in altitude.

Your class will build a vehicle and keep track of its location on the road. Location values may range from -2000 to 2000. A location value of 0 represents 0 feet, a location value of 100 represents 100 feet, a location value of 200 represents 200 feet, etc. The value of 0 just means the starting position, not actually 0 feet from sea level. If the user tries to move the vehicle beyond block +2000 or -2000, set the location to +/- 2000 respectively.

## Variables
`int location` - An integer that holds the current block location of the car on the road, with possible values ranging from -2000 to 2000.
Methods
`Plane ()` - Sets `location` to 0.
`Plane (int loc)` - If `loc` is between -2000 and 2000 inclusive, sets `location` to `loc`. Otherwise, sets `location` to 0.
`void upward ()` - Increments the plane upward 100 feet. Do not let the user move past 2000 feet.
`void downward ()` - Increments the vehicle downward 100 feet. Do not let the user move past -2000 feet.
`int getLocation ()` - Returns an integer representing the location of the plane.
`String toString ()` - Returns a `String` representation showing the plane as an `@` character, with spaces to show its location. When the vehicle is at location -2000 the @ character appears at the start of the String. When the plane is at a higher position, one space for each number from -2000 to the plane's current location appears before the @. For example if the plane is at -1000 feet, the method will return `"          @"` (10 spaces then the '@'). If the car is at 500 feet the method will return `"                         @"` (25 spaces then the '@').
To test your code before submission use the file runner_Plane.java (sample run shown below). You should ensure that both the Plane and runner classes compile before checking your code (or else your program will not be checked properly). Do not add a main method to your Plane class as this will also cause your code to be incorrectly scored.

## Sample Run
```
                 	  @
Location: 0
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
u
                	  @
Location: 100
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
n
Starting location for a new Plane?
-500
               @
Location: -500
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
d
              @
Location: -600
Type "u" to move upwards, "d" to move downwards, "n" for new Plane, "q" to quit.
q

        
```

## Milestones
As this is a more substantial coding exercise than most of the ones you have seen so far, we have provided milestones for you to help you think about how to build your Plane class.

**Milestone 1: Write the class header for your Plane class, and add curly braces - you will write the rest of your code inside these braces. Write a header and curly braces for each constructor and method in the class. For the two methods which return values add "dummy returns"** - for example `return 0;` for `getLocation` and `return "";` for `toString`. You will delete these returns later, but they will allow you to compile your code and test it in the meantime - you should check this works before moving on.

**Milestone 2: Add a private member variable for the location at the start of your class. Write the code inside your constructor to set up this variable correctly. Change the return statement inside your** `getLocation` method to return the location and use this to test your constructor class.

**Milestone 3: Add code to your upward and downward methods to change the location variable as described. Test this thoroughly using the runner class.**

**Milestone 4:** Add code to your `toString` method to print the Plane at its correct location. You will probably need to use a loop to add the correct amount of spaces before the "@" symbol representing the variable - remember you will need no spaces before the Plane when it is in position -2000, 20 spaces when it is in position 0, and 40 spaces when it is in position 2000. Test this method using the runner class, then submit your code for grading once you are convinced all parts of it are working correctly.