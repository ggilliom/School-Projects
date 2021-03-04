//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
 public static void main(String args[])
 {
  Scanner keyboard = new Scanner(System.in);
  
   //add in a do while loop after you get the basics up and running
   
   String question = "";
   
   String playChoice = ""; // what do you want to be? (Scanner)
  
   System.out.println("Would you like to play Rock Paper Scissors? (\"Yes\" or \"No\")");
    
   question = keyboard.nextLine();
    
   while(question.equals("Yes"))
   {
  
   System.out.println("Choose your weapon (\"Rock\" or \"Paper\" or \"Scissors\")");
   
   playChoice = keyboard.nextLine();
   
   System.out.println("You chose " + playChoice);
  
   RockPaperScissors game = new RockPaperScissors(playChoice);  
   System.out.println(game);
   
   System.out.println("\nWould you like to play again? (\"Yes\" or \"No\")");
    
   question = keyboard.nextLine();
   
   }
   
   System.out.println("Thanks for playing!");
   
 }
 
}



