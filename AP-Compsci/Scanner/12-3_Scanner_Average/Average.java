//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
  
  private String line;

  public Average()
  {
   
    setLine("");
   
  }

  public Average(String s)
  {
    
    setLine(s);
   
  }

  public void setLine(String s)
  {
   
    line = s;
   
  }
 
  public int getCount()
  {
   
   int count = 0;  
   boolean check = true;
   Scanner chop = new Scanner(line);
   int whatever = 0;
  
    while(check)
    {
    count++;
    whatever = chop.nextInt();
    check = chop.hasNextInt();
    }
  
  return count;
  
  }


  public int getSum()
  {
   
    int sum = 0;
    boolean checker = true;
    Scanner chop = new Scanner(line);
    int something = 0;
    
    while(checker)
    {
    something = chop.nextInt();
    sum = sum + something;
    checker = chop.hasNextInt();
    }
    
    return sum;
    
  }

  public double getAverage()
  {
    
     double average = 0.000;
     
     average = ((double) getSum()) / getCount();
     average = (Math.round(average * 1000.000)) / 1000.000;
    
     return average;
    
  }

  public String getLine()
  {
    return line + "\n";
  }

  public String toString()
  {
    return "average = " + getAverage();
  }
}