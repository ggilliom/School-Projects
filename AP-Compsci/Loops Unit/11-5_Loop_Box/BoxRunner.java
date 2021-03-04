//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import static java.lang.System.*;

public class BoxRunner
{
   public static void main( String args[] )
   {
     int count = 3;
     Box garrett = new Box(count);
     garrett.getSize();
     System.out.println(garrett + "\n");
     
     count = 4;
     garrett = new Box(count);
     garrett.getSize();
     System.out.println(garrett + "\n");
     
     count = 5;
     garrett = new Box(count);
     garrett.getSize();
     System.out.println(garrett + "\n");
     
     count = 2;
     garrett = new Box(count);
     garrett.getSize();
     System.out.println(garrett + "\n");
     
     count = 1;
     garrett = new Box(count);
     garrett.getSize();
     System.out.println(garrett + "\n");
     
   }
}