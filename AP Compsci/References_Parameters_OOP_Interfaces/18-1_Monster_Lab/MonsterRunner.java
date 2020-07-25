//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
  public static void main( String args[] )
  {
   
   Scanner keyboard = new Scanner(System.in);
  
   System.out.println("Please enter the name and size of your first Monster");
  
   System.out.print("Name: ");
  
   String name1 = keyboard.next();
  
   System.out.print("Size: ");
  
   int size1 = keyboard.nextInt();
  
   Monster garrett1 = new Monster(name1, size1);
   
   System.out.println("Please enter the name and size of your second Monster");
  
   System.out.print("Name: ");
  
   String name2 = keyboard.next();
  
   System.out.print("Size: ");
  
   int size2 = keyboard.nextInt();
  
   Monster garrett2 = new Monster(name2, size2);
   
   System.out.println("Monster 1 - " + garrett1.toString());
   
   System.out.println("Monster 2 - " + garrett2.toString());
   
   if(garrett1.isBigger(garrett2))
   {
     System.out.println("Monster 1 is bigger than Monster 2");
   }
   
   if(garrett1.isSmaller(garrett2))
   {
     System.out.println("Monster 1 is smaller than Monster 2");
   }
   
   if(!garrett1.isBigger(garrett2) && !garrett1.isSmaller(garrett2))
   {
     System.out.println("Monster 1 is the same size as Monster 2");
   }
   
   if(garrett1.namesTheSame(garrett2))
   {
     System.out.println("Monster 1 has the same name as Monster 2");
   }
   else
   {
     System.out.println("Monster 1 does not have the same name as Monster 2");
   }
  
   //ask for name and size
  
   //instantiate monster two
  }
}