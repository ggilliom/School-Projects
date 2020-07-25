//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import static java.lang.System.*;
import java.util.Arrays;

public class AtCounter
{
   private String[][] atMat;
   private String[][] copyMat;
   private String other;

 public AtCounter()
 {
   atMat = new String[10][10]; //size the matrix
   copyMat = new String[10][10];
   double rand = 0;
   
   for(int row = 0; row < 10; row++)
   {
     for(int col = 0; col < 10; col++)
     {
       rand = Math.random();
       if(rand < .5)
       {
         atMat[row][col] = "-";
       }
       else
       {
         atMat[row][col] = "@";
       }
     }
    System.out.println(Arrays.toString(atMat[row]));
   }
   
  //use nested loops to randomly load the matrix
  //you will need to use Math.random()
 }

 public void reset()
 {
   for(int row = 0; row < 10; row++)
   {
     for(int col = 0; col < 10; col++)
     {
       copyMat[row][col] = atMat[row][col];
     }
   }
 }
 
 public int countAts(int r, int c)
 {
   int count = 0;
   if(r > -1 && c > -1 && r < 10 && c < 10)
   {
     if(copyMat[r][c].equals("@"))
     {
       copyMat[r][c] = "-";
       count++;
       count += countAts(r - 1, c);
       count += countAts(r + 1, c);
       count += countAts(r, c - 1);
       count += countAts(r, c + 1);
     }
   }
 return count;
  //add in recursive code to count up the # of @s connected
  //start checking at spot [r,c]
 }

 /*
  *this method will return all values in the matrix
  *this method should return a view of the matrix
  *that looks like a matrix
  */
 public String toString()
 {
  return "";
 }
}