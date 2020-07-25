//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import static java.lang.System.*;

public class Monster implements Comparable
{
 private String name;
 private int howBig; 

 public Monster()  // write both
 {
   
   setValues("", 0);
   
 }

 public Monster(String n, int size)
 {
   
   setValues(n, size);
   
 }
 
 public void setValues(String n, int size)
 {
   
   name = n;
   howBig = size;
   
 }

 public String getName()  // returns name
 {
   return name;
 }
 
 public int getHowBig()  // returns how big
 {
   return howBig;
 }
 
 public boolean isBigger(Monster other)
 {
   
   if(getHowBig() > other.getHowBig())
   {
     return true;
   }
   
   return false;
 }
 
 public boolean isSmaller(Monster other)  // if its NOT isBigger && NOT isSmaller, then it's equal
 {
  if(getHowBig() < other.getHowBig())
  {
    return true;
  }
  
  return false;
 }

 public boolean namesTheSame(Monster other)  // this.getName().equals(other.getName())
 {
   if(getName().equals(other.getName()))
   {
     return true;
   }
  return false;
 }
 
 public int compareTo(Object obj)
 {
   Monster other = (Monster) obj;
   
   if(getHowBig() > other.getHowBig())
   {
     return 1;
   }
   if(getHowBig() < other.getHowBig())
   {
     return -1;
   }
   return 0;
 }
 
 public String toString() //  should not print more than "Monster 1 - Garrett 3" (just print out facts about monster) 
 {
  return "" + getName() + " " + getHowBig();
 }
}