//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 11/20/2018

public class SumLastRunner
{
  
 public static void main( String args[] )
 {           
   
   int[] ray1 = {-99,1,2,3,4,5,6,7,8,9,10,5};
   int[] ray2 = {10,9,8,7,6,5,4,3,2,1,-99};
   int[] ray3 = {10,20,30,40,50,-11818,40,30,20,10};
   int[] ray4 = {32767};
   int[] ray5 = {255,255};
   int[] ray6 = {9,10,-88,100,-555,2};
   int[] ray7 = {10,10,10,11,456};
   int[] ray8 = {-111,1,2,3,9,11,20,1};
   int[] ray9 = {9,8,7,6,5,4,3,2,0,-2,6};
   int[] ray10 = {12,15,18,21,23,1000};
   int[] ray11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
   int[] ray12 = {9,10,-8,10000,-5000,-3000};
   
   RaySumLast garrett = new RaySumLast();
   
   System.out.println(RaySumLast.go(ray1));
   System.out.println(RaySumLast.go(ray2));
   System.out.println(RaySumLast.go(ray3));
   System.out.println(RaySumLast.go(ray4));
   System.out.println(RaySumLast.go(ray5));
   System.out.println(RaySumLast.go(ray6));
   System.out.println(RaySumLast.go(ray7));
   System.out.println(RaySumLast.go(ray8));
   System.out.println(RaySumLast.go(ray9));
   System.out.println(RaySumLast.go(ray10));
   System.out.println(RaySumLast.go(ray11));
   System.out.println(RaySumLast.go(ray12));
   
 }
 
}