//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
     
  Scanner keyboard = new Scanner(in);
  
  out.print("How many monsters are in the herd? :: ");
  int size = keyboard.nextInt();
  Monsters herd = new Monsters(size);
  String name = "";
  int howBig = 0;

  for(int spot = 0; spot < size; spot++)
  {
   
   //read in monster values 
   System.out.print("\nEnter the name :: ");
   name = keyboard.next();//ask for name
   System.out.print("Enter the size :: ");
   howBig = keyboard.nextInt();//ask for size
 
   Monster thing = new Monster(name, howBig);

   herd.add(spot, thing);//instantiate a new Monster() and add it to the herd   
   
  }  
  
  System.out.println("\nHERD: " + herd);
  
  System.out.println("SMALLEST: " + herd.getSmallest());
  System.out.println("LARGEST: " + herd.getLargest());
  
  Arrays.sort(herd.sorting());
  
  System.out.println("SORTED: " + herd);
  //print out the other stats
   
 }  
}