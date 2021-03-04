//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 12/12/18

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class DownRunner
{
  
 public static void main( String args[] )
 {          
   
   ArrayList<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345));
   ListDown garrett = new ListDown();
   System.out.println(garrett.go(nums1));
   
   ArrayList<Integer> nums2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
   System.out.println(garrett.go(nums2));
   
   ArrayList<Integer> nums3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
   System.out.println(garrett.go(nums3));
   
   ArrayList<Integer> nums4 = new ArrayList<Integer>(Arrays.asList(32767));
   System.out.println(garrett.go(nums4));
   
   ArrayList<Integer> nums5 = new ArrayList<Integer>(Arrays.asList(255,255));
   System.out.println(garrett.go(nums5));
   
   ArrayList<Integer> nums6 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
   System.out.println(garrett.go(nums6));
   
   ArrayList<Integer> nums7 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
   System.out.println(garrett.go(nums7));
   
   ArrayList<Integer> nums8 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
   System.out.println(garrett.go(nums8));
   
   ArrayList<Integer> nums9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
   System.out.println(garrett.go(nums9));
   
   ArrayList<Integer> nums10 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
   System.out.println(garrett.go(nums10));
   
   ArrayList<Integer> nums11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455));
   System.out.println(garrett.go(nums11));
   
   ArrayList<Integer> nums12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,1000));
   System.out.println(garrett.go(nums12));
   
 }
 
}