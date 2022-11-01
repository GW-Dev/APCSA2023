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
<h2 id='title'>STRING CLEANER</h2><br /> 
<h4 id='goalHead'>Lab Goal:</h4>
<div id='goal'>This lab was designed to teach you how to use a <code>while</code> loop.</div> 
<h4 id='descHead'>Lab Description:</h4>
<div id='desc'>Remove all occurrences of the removal string from the  
original string. Each time you take out the removal string  
you must also remove the letter that preceded the removal  
string. After you remove a string and its leading character,  
you must check to see if any more occurrences of the removal  
string exist.</div>
<h4 id='dataHead'>Sample Data:</h4>
<pre>
xR-MxR-MHelloxR-M    R-M 
sxsssxssxsxssexssxsesss   xs
fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn   qwerty 
dogdogcatddodogdogdoggog     dog
</pre>
<h4 id='outHead'>Sample Output:</h4>
<pre>
xR-MxR-MHelloxR-M - String to remove R-M 
Hello<br />
sxsssxssxsxssexssxsesss - String to remove xs 
sesss<br />
fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn - String to remove qwerty 
fun<br />
dogdogcatddodogdogdoggog  -  String to remove dog 
catgog
</pre> 
<div id='filesBox'><h4 id='filesHead'>Files Needed:</h4>
StringRemover.java<br />StringRemoverRunner.java</div> 
<h4><span id='algoHead'>algorithm help</span>:</h4>
<pre style='width: 400px;'>
use indexOf to look for more removals<br /> 
while you have more removals
{
    take out the current removal using substring 
    use indexOf to look for more removal 
}
</pre>
</div>
<br /><br />
<!-- <span style='color: red;'>* Be sure to disable display of handout before submitting.</span><br /><br /> -->
