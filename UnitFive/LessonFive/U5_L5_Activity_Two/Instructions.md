Finish writing the Oven class that represents an oven. This class has the variables, constructors and methods detailed below. You should write code implementing the methods and constructors so they behave as described.

### Variables

* `private int maxTemp` - the maximum temperature of the oven. This value should not be changed after the oven is constructed. If the temperature is greater than 500, it should be changed to 500, and if the temperature is less than 0, it should be changed to 0.
* `private int currentTemp` - the current temperature of the oven. Should not be greater than maxTemp or less than 0.

### Constructors

* `public Oven(int maxTemperature, int startTemperature)` - constructs and an object of type `Oven` with the given maxTemperature and startTemperature.
Methods

* `public int getMaxTemp()` - returns the `maxTemp` of the oven.
* `public int getCurrentTemp()`- returns the `currentTemp` of the oven.
* `public void turnOff()` - sets the `currentTemp` of the oven to 0 if the `currentTemp` of the oven is greater than 0.
* `public boolean isOn()` - return true if `currentTemp` of the oven is greater than 0.
* `public void preheat(int temp)` - sets `currentTemp` of the oven to temp. If temp is greater than maxTemp, then set currentTemp to maxTemp. If temp is less than or equal to 0, do nothing.

To test your code before submission, use the file runner_Oven.java. Run the main method in the runner_Oven class and verify that the program produces the expected output. A sample run is shown below, but you should also try a range of other inputs to test your code more thoroughly.

If the runner file does not compile then you should attempt to fix your Oven class before checking your code for a score. Start by checking that the signatures and return types of your Oven methods match the descriptions exactly. You should also not add a main method to your Oven class, since you may not be able to run your code, and it will not be scored correctly when you check it.

### Sample run
```
Maximum oven temperature:
450
Starting temperature of the oven:
70
New oven with a maximum temperature of 450 and a starting temperature of 70 degrees.
To preheat the oven enter "p", to turn the oven off enter "o", to restart enter "r", to quit enter "q"
p
Enter the temperature to preheat the oven to:
350
Current temperature of the oven is now 350 degrees

New oven with a maximum temperature of 450 and a starting temperature of 350 degrees.
To preheat the oven enter "p", to turn the oven off enter "o", to restart enter "r", to quit enter "q"
o
Turning the oven off.

New oven with a maximum temperature of 450 and a starting temperature of 0 degrees.
To preheat the oven enter "p", to turn the oven off enter "o", to restart enter "r", to quit enter "q"
q
```
Hint - Start by writing the 3 accessor methods - getMaxTemp, getCurrentTemp and isOn. These methods just need to return the relevant member variables. Once this is done you will be able to compile and run the runner class to test your code. Then you can focus on writing and testing the more difficult remaining methods.