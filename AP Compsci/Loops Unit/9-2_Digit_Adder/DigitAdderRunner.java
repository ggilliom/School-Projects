//� A+ Computer Science  -  www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 11/1/18
//Class - APCSA
//Lab  - 9-2 Digit Adder


// You do not need to make any changes to this runner file!

import static java.lang.System.*;

public class DigitAdderRunner
{
 public static void main( String args[] )
 {
  int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222 };
  
  DigitAdder s = new DigitAdder();
    
  for( int val : cases )
  {
   System.out.println( s.go( val ) );
  }
 }
}