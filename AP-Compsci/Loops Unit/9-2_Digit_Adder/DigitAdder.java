//© A+ Computer Science  -  www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 11/1/18
//Class - APCSA
//Lab  - 9-2 Digit Adder

import static java.lang.System.*;

public class DigitAdder
{
 public static int go( int num )
 {
   int sum = 0;
   int div;
   
   while (num > 0)
   {
     div = num % 10;
     num /= 10;
     sum = div + sum;
   }
   
  return sum;
 }
}