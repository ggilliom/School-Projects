import random
import time
import turtle


""" Use https://docs.python.org/3.3/library/turtle.html and other online documentation if you need help on Turtle operations
Ignore the first phrase - "Turtle graphics is a popular way for introducing programming to kids."
Turtle graphics will help us get more comfortable with using objects
"""


""" --- 1. Turtles getting ready for the race --- """

#create an object of class turtle and store it in variable Alex
#create an object of class turtle and store it in variable Tess
#create an object of class turtle and store it in variable Zuki
 
#place Alex at position 0,20 (without leaving the trace)
#place Tess at position 0,40 (without leaving the trace)

#make Alex, Tess and Zuki to look like turtles rather than like arrows

#make Alex red
#make Tess green
#make Zuki blue

#(Run your program now. you should see three turtles aligned vertically.)  

""" --- 2. Turtles getting ready for the race --- """ 
#define a moveme() function that takes a Turtle object as input and a number, then moves the turtle forward by a given number of units.

def moveme(ttle, step):
    pass #replace pass with your code. Make sure turtle doesn't leave the trace, it should just change its location

#moveme(Alex,10) -- uncomment this to test your moveme function. It should display Alex by 10 units




""" --- 3. Race begins--- """ 



#add a loop that repeats 50 times, and at each iteration uses moveme() function to move Alex a random number of units, Tess a random number of units   and Zuki a random number of units units
#your random displacement number should be between 1 and 10
#add time.sleep(0.1) within the loop after  all moveme() are called




""" --- 4. Counter added --- """
""" Let's add a counter that will display to us the number of iteration. As you can imagine, it will be changing with each iteration.
First, we need to display a value with a number of iteration - you already know how to display a word, use that knowledge
However, we'll need to be able to erase that value before we display a new one. One way to accomplish it would be to write the value in black, wait, then write it in white before writing a new value in black.
"""

#add the following code above before your loop
"""turtle.ht()
turtle.penup()
turtle.goto(50,50)"""

#put the code to display the current iteration number (value of i) in black in the beginning of the loop
#put the code to display the current iteration number (value of i) in white at the end of the loop (after time.sleep(0.1))




""" --- 5. Finish the program    --- """

#nothing to do here, just run and enjoy turtle race. Contours of numbers may still be visible, it's fine.
turtle.done()
