//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 12/12/18

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ListDown
{
 //go() will return true if all numbers in numArray
 //are in decreasing order [31,12,6,2,1]
 public static boolean go(List<Integer> nums)
 {
   
   int checkD = 0;
   
   for (int place = 0; place < nums.size() - 1; place++)  // decreasing
   {
     if(nums.get(place) <= nums.get(place + 1))
     {
       checkD++;
     }
   }
   
   if(checkD >= 1)
   {
     return false;
   }
   else
   {
 return true;
   }
 
 } 
}