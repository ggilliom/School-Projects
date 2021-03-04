//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
  
   public static void main( String args[] )
   {
     
     String s1 = "9 10 5 20";
     Average garrett = new Average(s1);
     garrett.getCount();
     garrett.getSum();
     garrett.getAverage();
     garrett.getLine();
     System.out.println(s1);
     System.out.println(garrett + "\n");
     
     String s2 = "11 22 33 44 55 66 77";
     garrett = new Average(s2);
     garrett.getCount();
     garrett.getSum();
     garrett.getAverage();
     garrett.getLine();
     System.out.println(s2);
     System.out.println(garrett + "\n");

     String s3 = "48 52 29 100 50 29";
     garrett = new Average(s3);
     garrett.getCount();
     garrett.getSum();
     garrett.getAverage();
     garrett.getLine();
     System.out.println(s3);
     System.out.println(garrett + "\n");
     
     String s4 = "0";
     garrett = new Average(s4);
     garrett.getCount();
     garrett.getSum();
     garrett.getAverage();
     garrett.getLine();
     System.out.println(s4);
     System.out.println(garrett + "\n");
     
     String s5 = "100 90 95 98 100 97";
     garrett = new Average(s5);
     garrett.getCount();
     garrett.getSum();
     garrett.getAverage();
     garrett.getLine();
     System.out.println(s5);
     System.out.println(garrett + "\n");
     
 }
   
}