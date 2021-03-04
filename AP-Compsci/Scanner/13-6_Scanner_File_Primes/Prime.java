//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
  
  private int number;
  private String outcome;
  
  public Prime()
  {
    
    setPrime(0);
    
  }
  
  public Prime(int num)
    
  {
    
    setPrime(num);
    
  }
  
  //constructor methods go here
 

  public void setPrime(int num)
  {

    number = num;
    
  }

  //boolean isPrime()   goes here
  
  public String isPrime()
  {
    
    int check = 0;
    
    if (number % 2 == 0 && number != 2)
    {
      
      outcome = number + " IS NOT PRIME";
      
    }
    else
    {
      
    for (int spot = 3; spot <= (number / 2); spot = spot + 2)
    {
      
      if (number % spot == 0)
      {
        
        outcome = number + " IS NOT PRIME";
        spot = number;
        
      }
      
      else
      {
        
        if (spot != number)
        {
          
          outcome = number + " IS PRIME";
          
        }
        
      }
      
    }
      
    }
    
    if(number == 2 || number == 1)
    {
      
      outcome = number + " IS PRIME";
      
    }
    
    return outcome;
    
  }

  public String toString()
    
  {
  
  return isPrime();
  
  }
  
}