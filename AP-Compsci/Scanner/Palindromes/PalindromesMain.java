import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

// Name: Garrett Gilliom
// Period: 8

public class PalindromesMain
{
  
  public static void main(String[] args)
  {
    
    Scanner type = new Scanner(System.in);
    
    System.out.print("Enter a String: ");
    String enter = type.nextLine();
    
    Palindromes garrett = new Palindromes(enter);
    
    garrett.getPali();
    System.out.println(garrett);
    
  }
  
}