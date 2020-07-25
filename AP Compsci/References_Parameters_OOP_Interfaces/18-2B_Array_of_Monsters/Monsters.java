//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
 private Monster[] myMonsters;
 private Monster biggest;
 private Monster smallest;

 public Monsters(int size)  
 {
   myMonsters = new Monster[size];
 }

 public void add(int spot, Monster m)
 {
   
   myMonsters[spot] = m;
   
//put m in the Monster array at [spot]
 }

 public Monster getLargest()
 {
   biggest = myMonsters[0];
   for(Monster item : myMonsters)
   {
     
     if(item.getHowBig() > biggest.getHowBig())
     {
       biggest = item;
     }
   }
   
   return biggest;
 }

 public Monster getSmallest()
 {
   smallest = myMonsters[0];
   for(Monster item : myMonsters)
   {
     if(item.getHowBig() < smallest.getHowBig())
     {
       smallest = item;
     }
   }
  return smallest;
 }
 
 public Monster[] sorting()
 {
   return myMonsters;
 }
 
 public String toString()
 {
  return Arrays.toString(myMonsters);
 }
 
}