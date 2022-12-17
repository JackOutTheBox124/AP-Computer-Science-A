### StarDiamonds.java:
You will be writing a program to output an <b>ODD</b> number of stars on a screen in a pattern based upon the user’s selection of the number of stars he/she would like to print. In order to do this, you will create a menu using a switch statement, and you must use <i>nested for loops</i>. You must complete at least 3 of these activities, but may receive additional credit for additional activities. However, note that you can do some copy/pasting of code and make some minor changes as the level of difficulty increases!

<b>Text for menu:</b>
<pre>
[1] Diamond Activity(Easy) - Align left, number of rows equal columns 	
[2] Diamond Activity(Moderate)-Align left, stars printed decrease by 1 each row
[3] Diamond Activity (Moderately hard)-Aligned right,stars printed decrease by 1 each row
[4] Diamond Activity (Hard)- Aligned center, stars printed increasing by odd numbers until get to # entered 	
[5] Diamond Activity(Challenge)- Aligned center, stars printed increasing by odd numbers until get to # entered, the reversed
[0] Quit
</pre>

<b>For each case in the switch statement, prompt the user for the number of stars he/she would like to print:</b>
<pre>System.out.println("Select an odd number of stars you would like to print:");</pre>

<b>Below are the sample outputs (patterns) for each activity:</b>

<b>Sample Output:</b>
<pre>
Select the number of stars you would like to print:
10
Invalid entry- Please enter an odd integer.
</pre>

<b>Sample Output:</b>
<pre>
[1] Diamond Activity(Easy) - Align left, number of rows equal columns 

Select the number of stars you would like to print:
> 7
*******
*******
*******
*******
*******
*******
*******
</pre>

<b>Sample Output:</b>
<pre>
[2] Diamond Activity(Moderate)-Align left, stars printed decrease by 1 each row

Select the number of stars you would like to print:
> 7
*******
******
*****
****
***
**
*
</pre>

<b>Sample Output:</b>
<pre>
[3] Diamond Activity (Moderately hard)- Aligned right, stars printed decrease by 1 each row

Select the number of stars you would like to print:
> 7
*******
 ******
  *****
   ****
    ***
     **
      *
</pre>

<b>Sample Output:  (NOTE: the “s” is supposed to be a space! You can use an actual space or another character)</b>
<pre>
[4] Diamond Activity (Hard)- Aligned center, stars printed increasing by odd numbers until get to # entered

Select the number of stars you would like to print:
> 7
ssss*
sss***
ss*****
s*******
</pre>

<b>Sample Output:  (NOTE: the “s” is supposed to be a space! You can use an actual space or another character)</b>
<pre>
[5] Diamond Activity(Challenge)- Aligned center, stars printed increasing by odd numbers until get to # entered, then reversed
Select the number of stars you would like to print:
> 7
ssss*
sss***
ss*****
s*******
ss*****
sss***
ssss*
</pre>

