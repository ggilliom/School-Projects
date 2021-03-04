//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
 public static void main( String args[] )
 {
   
   boolean check = true;
   
   while(check)
   {
   
   Scanner word = new Scanner(System.in);
   
   String tri = word.nextLine();
   
   TriangleWord garrett = new TriangleWord();
   
   garrett.printTriangle(tri);
   
   System.out.println();
   
   System.out.println("Would you like to try another word? (Enter \"Yes\" or \"No\")");
   
   String ask = word.nextLine();
   
   if(ask.equals("No"))
   {
     check = false;
   }
   
   }
   
 }
}