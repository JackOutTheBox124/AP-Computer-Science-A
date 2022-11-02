## Instructions

Computer science jobs are in demand. Right now we have a shortage of people that can do computer programming, and one of the fastest growing areas of new jobs in the sector are so-called hybrid jobs. This means you specialize in an area like biology, and then use computer programming to do your job.

These hybrid jobs exist in the arts, sciences, economics, healthcare, and entertainment fields.

One of these jobs is computational biology. Computational Biology, sometimes referred to as bioinformatics, is the science of using biological data to develop algorithms and relations among various biological systems.

### The Scenario: Freya's Longitude/Latitude

In this activity, we are going to write a program which could be used to investigate data about the movements of a white shark named Freya, who has been fitted with a GPS tracker.

The following table contains the data for Freya's movement. 

| Date    | Lat1  | Lat2    |
|---------|-------|---------|
| 6/24/22 | 36.96 | -75.731 |
| 6/25/22 | 37.20 | -75.731 |
| 6/27/22 | 38.00 | -75.162 |
| 6/29/22 | 38.39 | -74.975 |
| 6/30/22 | 38.63 | -74.917 |
| 7/02/22 | 40.05 | -73.700 |
| 7/03/22 | 40.18 | -73.701 |

### The Activity

Write the program into which we could enter Freya's latitude and longitude data. Each time a new latitude and longitude is entered, the program should ask if you want to continue – it should continue to ask for input if the user enters 1 and stop if the user enters 0.

If an invalid pair of coordinates is entered, then the program should print "Incorrect latitude or longitude." A latitude value is invalid if it is not between -90 and 90 inclusive. A longitude value is invalid if it is not between -180 and 180 inclusive.

Once the user has finished inputting the data, the program should display the farthest distance traveled by Freya in each direction (you may assume the user has entered at least one valid longitude/latitude pair). However, any invalid pairs of coordinates should be ignored when calculating these values - this includes ignoring a valid latitude if it is entered with an invalid longitude and vice versa.

The farthest points are given by:

* Farthest North - maximum latitude
* Farthest South - minimum latitude
* Farthest East - maximum longitude
* Farthest West - minimum longitude
Please note - you are not expected to enter all of Freya's data into your program; you can simply make up some sample data points if you wish.

Sample Run:

<pre>
Please enter the latitude:
36.96
Please enter the longitude:
-75.731
Would you like to enter another location? (1 for yes, 0 for no)
1
Please enter the latitude:
37.20
Please enter the longitude:
-75.162
Would you like to enter another location? (1 for yes, 0 for no)
1
Please enter the latitude:
38.00
Please enter the longitude:
-75.162
Would you like to enter another location? (1 for yes, 0 for no)
1
Please enter the latitude:
38.39
Please enter the longitude:
-74.975
Would you like to enter another location? (1 for yes, 0 for no)
1
Please enter the latitude:
38.63
Please enter the longitude:
181
Incorrect Latitude or Longitude
Would you like to enter another location? (1 for yes, 0 for no)
0
Farthest North: 38.39
Farthest South: 36.96
Farthest East: -74.975
Farthest West: -75.731
</pre>

To help you with the development of this code, here are some useful milestones to consider. Note - these milestones encourage you to write the code in an iterative way: you will write a program with basic functionality and test it, then add more features in each milestone, rather than writing code in the order it appears in the program.

Milestone 1: Set up a scanner and an int variable to hold the answer to the question "Would you like to enter another location? (1 for yes, 0 for no)". Write a while loop based on this variable and add code to it which asks this question and gets an int response from the user.

Milestone 2: Write print/input statements to get the user to enter latitudes and longitudes inside the while loop. Write code which tests if these are both valid, and prints "Incorrect Latitude or Longitude" if not.

Milestone 3: Set up variables at the start of your program to hold the maximum and minimum longitudes and latitudes - set these to appropriate starting values based on the limits for longitude and latitude. Add code in the while loop which compares these values to the current maxima/minima and updates as appropriate. Write final print statements to print out the farthest North/South/East/West positions using these values.