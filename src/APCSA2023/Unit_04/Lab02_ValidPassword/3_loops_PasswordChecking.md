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
#algoHead {color: blue; font-weight: bold; font-style: italic; text-decoration-line: underline;}
#filesBox {width: 250px; border: 1px solid black; padding: 0 5px 5px 5px; background-color: rgba(0, 100, 0, 0.1);} 
#filesHead {color: green;} 
</style>

<div id='body'> 

<h2 id='title'>
VALID PASSWORD
</h2>
<h4 id='goalHead'>Lab Goal:</h4>
<div id='goal'>
The lab was designed to teach you how to use a <code>do while</code> loop as well as how to use <code>&&</code>, <code>||</code>, and <code>!</code>.
</div>
<h4 id='descHead'>Lab Description:</h4>
<div id='desc'>
Set up a <code>password</code> variable and assign a password to this variable. 
Run your program and type in invalid passwords to check and see if your boolean 
logic is correct. Once the correct password is typed, the program should stop 
asking for input.
</div>
<h4 id='dataHead'>Sample Data:</h4>
<pre>
shown below
</pre>
<h4 id='outHead'>Sample Output:</h4>
<pre>
Enter the password :: hello
INVALID
Enter the password :: hacker
INVALID
Enter the password :: i
INVALID
Enter the password :: am
INVALID
Enter the password :: a
INVALID
Enter the password :: hacker
INVALID
Enter the password :: mchammer
INVALID
Enter the password :: go
INVALID
Enter the password :: hammer
INVALID
Enter the password :: mchammergo
INVALID
Enter the password :: mchammergoham
INVALID
Enter the password :: mchammergohammer
VALID
</pre>
<div id='filesBox'><h4 id='filesHead'>Files Needed:</h4>
PasswordCheck.java<br />
PassRunner.java
</div>
<h4><span id='algoHead'>
// EXAMPLE CODE USING A DO WHILE LOOP</span></h4>
<pre style='width: 400px;'>
int x = 99;
int y = 0;
do{
   out.print("Enter a number :: ");
   y = kb.nextInt();
}while(y!=x);
</pre>
</div>
<br /><br />
<!-- <span style='color: red;'>* Be sure to disable display of handout before submitting.</span><br /><br /> -->
