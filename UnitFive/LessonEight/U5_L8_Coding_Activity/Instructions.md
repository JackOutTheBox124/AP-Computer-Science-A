For this exercise, you will create a `Car` class to hold car data. You should create appropriate variables in your Car class to store the following information:

* Make - a string representing the make of the car
* Model - a string representing the model of the car
* Year - an integer representing the year the car was made
* MPG - a double representing the miles per gallon
* Car ID - an integer value which is automatically assigned (see below).
* The car IDs are assigned in order: the first car has an ID of 1, the second car ID is 2, the next is 3, and so on. When a new Car object is created, your code should automatically initialize car id to the next integer value. For example, if the last created Car's car id is 17, the next car id generated should be 18.

Your student class should include the following public methods:

* `Car()` -  Constructs a new car with make and model set to "None", year set to 0 and MPG set to 0. The car id should automatically be set to the next integer.
* `Car(String make, String model, int year, double mpg)` -  Constructs a new car with variables initialized to the values specified. The year should not be greater than 2022. If the year is less than 1885, set the year to 2000. The miles per gallon should be greater than or equal to 0. If the miles per gallon is less than 0, set miles per gallon equal to 0. The student id should automatically be set to the next integer.
* `String toString()` -  Returns the car information as a String in the following format:
```
ID: 1
Make: Toyota
Model: RAV4
Year: 2018
MPG: 32.5
```

To test your code prior to submission, use the file `runner_Car.java`. Run the runner_Car.main method and verify that the output matches the sample run below. Don't add your own main method to the Car class as this will lead to your code being checked and scored incorrectly.

Sample Run
```
Input the make of the car, "default" to create a default car or "q" to quit:
Toyota

Model of the car:
Rav4
Year of the car:
2017
Miles per gallon of the car:
32.5

Id: 1
Make: Toyota
Model: Rav4
Year: 2017
MPG: 32.5

Input the make of the car, "default" to create a default car or "q" to quit:
default

Id: 2
Make: None
Model: None
Year: 2000
MPG: 0.0
Input the make of the car, "default" to create a default car or "q" to quit:
default

Id: 3
Make: None
Model: None
Year: 2000
MPG: 0.0
Input the make of the car, "default" to create a default car or "q" to quit:
q

Exiting. Bye!
```