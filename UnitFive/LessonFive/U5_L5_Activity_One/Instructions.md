Create a class named Person which will represent a unique person. The class should store the following information in appropriate (private) variables:
* The first name of the **person**
* The last name of the **person**
* The age of the **person** (in years)
* The social security number (SSN) of the **person**

You should write a constructor for the class with the signature `Person(String firstName, String lastName, int age, String ssn)`, which sets the four variables for the class in the following way:

```
SSN: Social Security Number

    Name: Person's Name

    Age: Person's age
```

Note that the second and third lines of the string start with a single tab character.

You'll need to add member variables (fields) to your class to store the information for a person - make sure you choose the names of these carefully to avoid a conflict with the names of the parameters you use in your constructor.

You will also need to add a toString() method to convert the details of a Person. Use the format shown below in the sample run.

To test your Person class before submission, switch to the file runner_Person.java and run the main method in the runner_Person class. Check your output matches the sample run when you input those values and try entering different values to check the code works correctly.

If the runner file does not compile then you should attempt to fix your Person class before submitting, as your code cannot be checked or scored correctly. Start by checking that the signatures and return types of your Person methods match the descriptions exactly. You should also not add a main method to your Person class, since you may not be able to run your code, and it will not be scored correctly when you check it.

## Sample run
```
Enter the person's first name:
Jon
Enter the person's last name: 
Doe
Enter the person's age: 
35
Enter the person's social security number: 
123456789

SSN: 123456789
    Name: Jon Doe
    Age: 35
```