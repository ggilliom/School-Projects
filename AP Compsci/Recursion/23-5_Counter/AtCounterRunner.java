//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import static java.lang.System.*;
import java.util.Arrays;

public class AtCounterRunner
{
 public static void main(String args[])
 {
   //instantiate an AtCounter
   AtCounter garrett = new AtCounter();
   garrett.reset();
   System.out.println("0 0 has " + garrett.countAts(0, 0) + " @s connected");
   garrett.reset();
   System.out.println("0 1 has " + garrett.countAts(0, 1) + " @s connected");
   garrett.reset();
   System.out.println("5 0 has " + garrett.countAts(5, 0) + " @s connected");
   garrett.reset();
   System.out.println("9 9 has " + garrett.countAts(9, 9) + " @s connected");
   garrett.reset();
   System.out.println("3 9 has " + garrett.countAts(3, 9) + " @s connected");
   //test cases from document
   //test the code
 }
}