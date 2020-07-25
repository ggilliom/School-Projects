// Name: Garrett Gilliom
// Period: 8

import java.util.Scanner;
import javax.swing.*;

public class CasinoFast
{
  
  public void outcome()  //  executes the entire Fast Mode
  {
    int repeat = 0;  // number of times the game is played
    int total = 0;  // amount of money lost or gained
    boolean check = true;  // checks if the die/dice sum requires the player to play again
    int sum = 0;  // sum of dice rolls
    int roll = 0;  // value of the individual die roll
    int spinner = 0;  //  value of the spinner
    double expect = 0;  //expected value
    int num = 0;  // amount of times played
    int bets = 0;  // total amount bet
    double wins = 0;  // total amount of wins
    double prob = 0;  // experimental probability
    String totalAsk = "";  //  gets the String that tells whether or not the used lost or gained money, and how much the user ended with
    String expectAsk = "";  //  gets average earnings per game
    
    JFrame ask = new JFrame("Input Dialog");  //  just a GUI
    repeat = Integer.parseInt(JOptionPane.showInputDialog(ask, "How many times would you like to play?"));  //  number of times the user would like to play, https://stackoverflow.com/questions/20018222/using-int-in-java-gui
    
    for(int spot = 0; spot < repeat; spot++)
    {
      
      roll = 0;  //  resets the value
      spinner = 0;  //  resets the value
      check = true;  //  resets the value
      
    while(check)  //  loops if die/dice sum is less than 9
    {
      sum = 0;
      spinner = (int) (Math.random() * 4) + 1;
    
      for(int count = 0; count < spinner; count ++)
        {
          roll = (int) (Math.random() * 6) + 1;
          sum += roll;
        }
    
      if(sum > 8)
        {
        check = false;
        }
      
      }
    
    if(sum == 9 || sum == 10 || sum == 11 || sum == 12)
    {
      total = total - 10;
    }
    
    if(sum > 12)
    {
      total = total + 10;
      wins++;
    }
    
    bets = bets + 10;
    num++;
    }
    
    if(total < 0)
    {
      totalAsk = "You lost $" + Math.abs(total) + " and ended with $" + (bets - Math.abs(total));
    }
    
    if(total >= 0)
    {
      totalAsk = "You gained $" + total + " and ended with $" + (bets + total);
    }
    
    expect = (double) ((((double) total + (double) bets) - (double) bets) / (double) num);
    
    expect = Math.round(((double) ((((double) total + (double) bets) - (double) bets) / (double) num) * 100.0)) / 100.0;
    
    if(expect < 0)
    {
      expectAsk = "Your average earnings per game is -$" + Math.abs(expect);
    }
    
    if(expect >= 0)
    {
      expectAsk = "Your average earnings per game is $" + expect;
    }
    
    prob = (Math.round((wins / (double) num) * 1000000.0)) / 10000.0;
      
    JOptionPane.showMessageDialog(ask, "You played " + num + " times\n" + "You bet $" + bets + " total\n" + totalAsk + "\n" + expectAsk + "\n" + "Your win probability is " + prob + "%\n" + "Thanks for playing!");
    
    
    
  }
  
}