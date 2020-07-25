import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

// Name: Garrett Gilliom
// Period: 8

public class CasinoMain
{
  
  public static void main(String[] args)
  {
    
    JFrame frame = new JFrame("Input Dialog");  //  Just a GUI
    
    String speed = JOptionPane.showInputDialog(frame, "Welcome to Fortune Favors the 13! It costs $10 to play.\nThe number you spin on the spinner tells you how many dice to roll.\nIf the sum of the dice is less than 9, roll again.\nIf the sum of the dice is 9, 10, 11, or 12, you lose.\nIf the sum of the dice is 13 or greater, you win!\nWould you like to play Fast Mode or Slow Mode? (Enter \"Fast\" or \"Slow\")");  //  Asks user if they want Fast Mode or Slow Mode  
    
    String play = "Yes";
    
    CasinoFast fast = new CasinoFast();
    
    if (speed.equals("Fast"))
    {
      while(play.equals("Yes"))
      {
      fast.outcome();  //  Runs Fast Mode
      play = JOptionPane.showInputDialog(frame, "\nWould you like to play again? (Enter \"Yes\" or \"No\")");
      }
    }
    
    
    if(speed.equals("Slow"))
    {
      CasinoSlow slow = new CasinoSlow();
      slow.outcome();  //  Runs Slow Mode
    }
    
  }
  
}