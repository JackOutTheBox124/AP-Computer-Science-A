### Unit 3 LAB: <code>Horoscope.java</code>


1. Write a program that asks for the user’s birthdate and outputs their astrological sign and horoscope (school appropriate).
   * You can look up a unique horoscope for each month, or use the same horoscope for up to 3 months (jan, feb, march output the same horoscope, april - june, etc…) Of course it is more fun if they are all random and/or different!!
2. You may use the sample run below, or you may have creative freedom with how you ask for the user’s birthdate (as Strings, ints, etc?).
3. Account for all possible combinations of capital or lowercase letters when the user enters the birth month. In other words, your program should work whether the user enters:
   <code>jan</code>, <code>JAN</code>, <code>Jan</code>, <code>JaN</code>, etc...
4. You may use <code>if/else</code> statements and/or <code>switch</code> statements (HINT: might need BOTH)!
5. Load a copy of your program to <b>Google Classroom → <i>Programming Assignments</i></b> and be prepared to share your horoscope with classmates!!


Use the chart below to determine the user’s astrological sign.

<table>
  <tr>
    <td>Aries (March 21-April 19)</td>
    <td>Leo (July 23-August 22)</td>
    <td>Sagittarius (November 22-December 21)</td>
  </tr>
  <tr>
    <td>Taurus (April 20-May 20)</td>
    <td>Virgo (August 23-September 22)</td>
    <td>Capricorn (December 22-January 19)</td>
  </tr>
  <tr>
    <td>Gemini (May 21-June 20)</td>
    <td>Libra (September 23-October 22)</td>
    <td>Aquarius (January 20-February 18)</td>
  </tr>
  <tr>
    <td>Cancer (June 21-July 22)</td>
    <td>Scorpio (October 23-November 21)</td>
    <td>Pisces (February 19-March 20)</td>
  </tr>
</table>

<b>SAMPLE RUN #1:</b> You can choose to make the user enter a full month or abbreviation.
<pre>
In which month were you born? (abbreviate month to first 3 letters)
jan
What day were you born?
25
Aquarius: You will resent being saddled with such a heavy burden, but take it in stride.
</pre>
<b>SAMPLE RUN #2:</b> Notice the “case” of the entry shouldn’t matter. Also, the day of the month may output a different zodiac sign!
<pre>

In which month were you born? (abbreviate month to first 3 letters)
JAN
What day were you born?
10
Capricorn: Seek an older relative's advice, even if this person doesn't know exactly what you're going through.
</pre>

<b>SAMPLE RUN #3:</b> Notice “April” was spelled wrong so the month entry wasn’t recognized.
<pre>
In which month were you born? (abbreviate month to first 3 letters)
apral
What day were you born?
1
Error entering month or day
</pre>

<b>SAMPLE RUN #4:</b> Notice the day was out of range so the entry wasn’t recognized.
<pre>
In which month were you born? (abbreviate month to first 3 letters)
Apr
What day were you born?
45
Error entering month or day
</pre>
