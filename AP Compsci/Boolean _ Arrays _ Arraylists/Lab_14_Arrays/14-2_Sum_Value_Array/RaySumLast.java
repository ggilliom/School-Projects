//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 11/20/2018

public class RaySumLast
{
  
 public static int go(int[] ray)
 {
   
   int total = 0;
   
   for (int num : ray)
   {
     
     if (num > ray[ray.length - 1])
     {
     
       total = total + num;
       
     }
     
   }
   
   if (total == 0)
     {
       
       total = total - 1;
       
     }
   
   return total;
  
 }
 
}