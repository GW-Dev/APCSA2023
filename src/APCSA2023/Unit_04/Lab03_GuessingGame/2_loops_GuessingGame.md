<style>
* {width: 800px; color: grey;}
#body {background-color: rgb(255, 255, 255); padding: 10px 25px; border: 2px solid black; box-shadow: 5px 5px 10px; border-radius: 10px;} 
#goal, #desc {white-space: normal; width: 750px;} 
pre {width: 600px;}
code {color: indianred;}
#title {background-color: black; color: white; width: 750px; padding: 3px;} 
#goalHead {color: red;}
#descHead {color: darkblue;} 
#dataHead {color: green;} 
#outHead {color: blue;} 
#algoHead {color: blue;}
#filesBox {width: 250px; border: 1px solid black; padding: 0 5px 5px 5px; background-color: rgba(0, 100, 0, 0.1);} 
#filesHead {color: green;} 
</style>
<div id='body'>
<h2 id='title'>
VALID PASSWORD
</h2>
<h4 id='goalHead'>Lab Goal:</h4>
<div id='goal'>
The lab was designed to teach you how to use a <code>do while</code> loop as 
well as how to use <code>&&</code>, <code>||</code>, and <code>!</code>.
</div>
<h4 id='descHead'>Lab Description:</h4>
<div id='desc'>
Create a guessing game that allows you to enter the number of numbers in the 
guessing game. The game will randomly (<code>Math.random()</code>) pick a 
number in the range provided and then allow you to guess the number. The game 
will keep track of the number of guesses and tell you what percentage of the 
time you guessed incorrectly.
</div>
<h4 id='dataHead'>Sample Data:</h4>
<pre>
shown below
</pre>
<h4 id='outHead'>Sample Output:</h4>
<pre>
Guessing Game - how many numbers? 5
Enter a number between 1 and 5 1
Enter a number between 1 and 5 2
Enter a number between 1 and 5 3
&nbsp;
It took 3 guesses to guess 3.
You guessed wrong 40 percent of the time.
&nbsp;
&nbsp;
Do you want to play again? y
Guessing Game - how many numbers? 5
Enter a number between 1 and 5 -3
Number out of range!
Enter a number between 1 and 5 9
Number out of range!
Enter a number between 1 and 5 1
Enter a number between 1 and 5 2
Enter a number between 1 and 5 3
Enter a number between 1 and 5 4
&nbsp;
It took 4 guesses to guess 4 .
You guessed wrong 60 percent of the time.
&nbsp;
&nbsp;
Do you want to play again? y
Guessing Game - how many numbers? 20
Enter a number between 1 and 20 1
Enter a number between 1 and 20 2
Enter a number between 1 and 20 3
Enter a number between 1 and 20 4
Enter a number between 1 and 20 5
Enter a number between 1 and 20 6
Enter a number between 1 and 20 7
Enter a number between 1 and 20 8
&nbsp;
It took 8 guesses to guess 8 .
You guessed wrong 35 percent of the time.
&nbsp;
&nbsp;
Do you want to play again? n</pre>
<div id='filesBox'><h4 id='filesHead'>Files Needed:</h4>
GuessingGame.java<br />
GuessRunner.java
</div>
</div>
<br /><br />
<!-- <span style='color: red;'>* Be sure to disable display of handout before submitting.</span><br /><br /> -->
