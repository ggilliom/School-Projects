// Name: Garrett Gilliom
// Period: 8

import java.util.Scanner;
import javax.swing.*;

public class CasinoSlow
{
  
  public void outcome()  //  executes the entire Slow Mode
  {
    
    JFrame ask = new JFrame("Input Dialog");  //  just a GUI
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
    String play = "Yes";  //  whether or not the player wants to play the game again
    String totalAsk = "";  //  gets the String that tells whether or not the used lost or gained money, and how much the user ended with
    String expectAsk = "";  //  gets average earnings per game
    String balance = "";  //  tells balance after each game is played
    String Roll = "";  //  shows die values
    
    while(play.equals("Yes"))  //  loops if player would like to play again
    {
      
      roll = 0;  //  resets the value
      spinner = 0;  //  resets the value
      check = true;  //  resets the value
      
    while(check)  //  loops if die/dice sum is less than 9
    {
      sum = 0;
      spinner = (int) (Math.random() * 4) + 1;
      JOptionPane.showMessageDialog(ask, "Spinner: " + spinner + "\nRoll " + spinner + " times!");
    
      for(int count = 0; count < spinner; count ++)
        {
          roll = (int) (Math.random() * 6) + 1;
          JOptionPane.showMessageDialog(ask, "Die: " + roll + "\n");
          sum += roll;
        }
    
      JOptionPane.showMessageDialog(ask, "Sum: " + sum);
      
      if(sum < 9)
      {
        JOptionPane.showMessageDialog(ask, "Spin again!");
      }
    
      if(sum > 8)
        {
        check = false;
        }
      
      }
    
    if(sum == 9 || sum == 10 || sum == 11 || sum == 12)
    {
      JOptionPane.showMessageDialog(ask, "You lose! :(");
      total = total - 10;
    }
    
    if(sum > 12)
    {
      JOptionPane.showMessageDialog(ask, "You win! Congratuations! :)");
      total = total + 10;
      wins++;
    }
    
    if(total < 0)
    {
      balance = "So far, your betting balance is -$" + Math.abs(total);
    }
    
    if(total >= 0)
    {
      balance = "So far, your betting balance is $" + total;
    }
    
    bets = bets + 10;
    num++;
    
    play = JOptionPane.showInputDialog(ask, balance + "\nWould you like to play again? (Enter \"Yes\" or \"No\")");
    
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