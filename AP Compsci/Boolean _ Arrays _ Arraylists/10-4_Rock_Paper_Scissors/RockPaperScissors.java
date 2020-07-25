//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
 
 private String question = "";
    
 private String player = "";
    
 private int compNumber = 0;
    
 private String computer = "";
    
 private int compCount = 0;
 
 private int playerCount = 0;
 
 private String outcome;

 public RockPaperScissors()
 {
   setPlayers("");
 }

 public RockPaperScissors(String playChoice)
 {
   setPlayers(playChoice);
 }

 public void setPlayers(String playChoice)
 {
   player = playChoice;
 }

 public String determineWinner()
 {
   
   int compNumber = (int) (Math.random()*3);
   
   if (compNumber == 0)
    {
      computer = "Rock";
    }
    
    if (compNumber == 1)
    {
      computer = "Paper";
    }
    
    if (compNumber == 2)
    {
      computer = "Scissors";
    }
    
    String compReturn = "Computer chose " + computer;
    
    //System.out.println("Computer chose " + computer + "\n");
    
    if (computer.equals("Scissors") && player.equals("Paper"))
    {
      
      outcome = "!Computer Wins <<Scissors Cuts Paper>>!";
      
    }
    
    if (computer.equals("Paper") && player.equals("Rock"))
    {
      
      outcome = "!Computer Wins <<Paper Covers Rock>>!";
      
    }
    
    if (computer.equals("Rock") && player.equals("Scissors"))
    {
      
      outcome = "!Computer Wins <<Rock Breaks Scissors>>!";
      
    }
    
    if (player.equals("Rock") && computer.equals("Scissors"))
    {
      
      outcome = "!You Win <<Rock Breaks Scissors>>!";
      
    }
    
    if (player.equals("Paper") && computer.equals("Rock"))
    {
      
      outcome = "!You Win <<Paper Covers Rock>>!";
      
    }
    
    if (player.equals("Scissors") && computer.equals("Paper"))
    {
      
      outcome = "!You Win <<Scissors Cuts Paper>>!";
      
    }
    
    if ((player.equals("Paper") && computer.equals("Paper")) || (player.equals("Scissors") && computer.equals("Scissors")) || (player.equals("Rock") && computer.equals("Rock"))) 
    {
      
      outcome = "!Draw Game!";
      
    }
   
   String winner = compReturn + "\n" + outcome;
   return winner;
   
 }

 public String toString()
 {
   
   String output = determineWinner();
   return output;
   
 }
 
}