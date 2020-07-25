//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
 //instance variables and constructors could be present, but are not necessary
  
 public static void printTriangle(String word)
 {
   
   for(int spot = 1; spot < word.length() + 1; spot++)
   {
     for(int place = 0; place < spot; place++)
     {
       System.out.print(word.substring(0, spot));
     }
   System.out.println();
   }
   
 }
}