DESCRIPTION:
This program simulates the financial accounts of a person over a time period of 40 years. 
The User can choose to either run a standard simulation, using predetermined input variables, or to run a personalized simulation using values from an input file.
The user may also choose each time whether or not the simulation will be based upon a financially literate person or not; this decision greatly affects the end wealth of the simulation.

INSTRUCTION:
The program should be ran using the compiler or an IDE.
To run using the compiler, open the terminal and press "ls" and enter to see a list of possible destinations to travel to in the computer.
Press "cd" and enter the name of the destination, then press enter.
Repeat this process until the location with the files are found.
enter "gcc FinLit.c -o Runner" to compile, and then "./Runner" to run.
Follow the prompts/instructions in the terminal (try to be exact with inputs).
If "no" is entered to supply personalized file input values, make sure to have an input file, formatted correctly (shown below), in the same location as the program files (this is necessary).
When it asks to type an output file name, make sure the name ends exactly in ".txt" (so, for example, "output.txt").
For runs with multiple people/non-standard input, there needs to be separate, individual files with correct formatting for unique input.

FUNCTIONALITY:
This program works best when its instructions are followed exactly. 
More could be done to ensure that the correct types are typed in, for example, when askings for characters or a number.
If characters other than the ones suggested in the prompt are attempted, the program may not work correctly, either.
However, the program will ensure that a valid input file address exists and will continue to ask the user for an input file name until one is found.
Still, the program does require a correct format of .txt file to run properly.
The program will automatically create a file to write output to if the entered file name doesn't already exist.

FORMAT EXAMPLE:

Savings: // Line 1
5000
Checkings:
0
Debt:
30100
YearlySalary:
59000
LoanInterest:
4.5
HouseCost:
175000
DebtInterest:
20
RentAmount:
850
MortgageTerm:
30