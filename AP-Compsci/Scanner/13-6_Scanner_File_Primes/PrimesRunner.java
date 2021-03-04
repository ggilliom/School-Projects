//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class PrimesRunner
{
  
 public static void main( String args[] ) throws IOException
 {
   
   Scanner file = new Scanner(new File("primes.dat"));
   
   int count = file.nextInt();  
   boolean check = true;
   int whatever = 0;
  
   do 
   {
     count = file.nextInt();
     check = file.hasNextInt();

     Prime garrett = new Prime(count);
     System.out.println(garrett);
    
    } while(check);
   
 }
 
}