<style>
h2{border-bottom:1px solid#CCC;padding-bottom:1px;}
</style>

<h2>Unit 1: Lesson 1: Output in Java</h2>
<div style="padding: 10px; background: lightskyblue; color: black">
    Lesson Objectives:
    <ul style="color:black">
        <li>Write your first lines of code in Java</li>
        <li>Use the System.out.print() and System.out.println() methods to print text and understand the difference between these commands</li>
        <li>Encounter the String data type, and know that strings are specified using double quotes</li>
    </ul>
</div>

In this lesson, you will get acquainted with your programming environment and write your first lines of code in Java.

### Programming, Compiling and Running Your Code
This lesson introduces the idea of programming by comparing it to giving someone directions to your house. When we program we give the computer a series of <i>instructions or commands</i>, and it’s important to remember that the computer will interpret literally everything we tell it.
Once we’ve written up our commands and hit "Run Code" the programming environment first <i>compiles</i> the code. When the computer compiles the code it checks that there are no immediate <i>errors</i> and that it understands the commands you are giving it. If the computer is unable to compile the code it will give <i>error messages</i>. Some of these are straightforward, like "; expected" and others are less helpful. The process of identifying and eliminating these errors is called <i>debugging</i>.

### Strings
<i>Strings</i> are anything that is not used for numerical calculations and can contain any kind of symbol, including letters, numbers, and special characters. We indicate to Java that something is a String literal by putting it inside quotation marks. Later, we will be creating String variables, but for now, all of our Strings will be created using the double quotation marks.

### Outputting Strings
In this lesson we learn our first two commands: <code style="color:red">System.out.print()</code> and <code style="color:red">System.out.println()</code>. The difference is subtle. <code style="color:red">System.out.print()</code> prints to the monitor, and <code style="color:red">System.out.println()</code> prints to the monitor, and then prints a blank line. If we want to print two things, each on their own line, the first command needs to be <code style="color:red">System.out.println()</code>:
<pre>
System.out.println("Hello");
System.out.print("World");
> Hello
> World
</pre>
vs.
<pre>
System.out.print("Hello");
System.out.println("World");
> HelloWorld
</pre>

When we use <code style="color:red">System.out.print()</code> or <code style="color:red">System.out.println()</code>, we put a String inside the parentheses. This tells Java to copy the String, regardless of its contents, and print it to the monitor. If we forget the quotation marks, we will get errors when we compile because then Java does not know that the characters inside the parentheses are supposed to be a String. All commands in Java end with a <i>semicolon</i>, and if we forget the semicolon we will also get an error when we try to compile.
<h2></h2>

#### Resources
Extend your learning by taking a look at:
* [Introduction to Programming Using Java: 2.4](http://math.hws.edu/javanotes/c2/s4.html#basics.4)
* [Official Java documentation: About the Java Technology](http://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html)
* In this lesson's video, you heard the word "bug" for the first time. Check out [this article on Grace Hopper](http://www.biography.com/people/grace-hopper-21406809`) the inventor of the term "computer bug."