//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import static java.lang.System.*;

public class Box
{
   private int size;
   private int star = 1;

 public Box()
 {
   setSize(0);
 }

 public Box(int count)
 {
   setSize(count);
 }

 public void setSize(int count)
 {
   size = count;
 }

 public int getSize()
 {
  return 0;
 }

 public String toString()
 {
  String output="";
  int pound = size;
  for (int track = 1; track <= size; track++)
    {
      
      while (star <= size)
      {
        output += "*";
        star++;
      }
      
      while (pound >= size)
      {
        output += "#";
        pound--;
      }
      
      star = track + 1;
      pound = size + track;
      output += "\n";
      
    }
  return output;
 }
}