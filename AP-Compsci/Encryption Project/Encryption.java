// Garrett Gilliom
// Period 8

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.util.Arrays;

public class Encryption
{
  public static void main(String args[])
  {
    EncryptMethods garrett = new EncryptMethods();
    Scanner type = new Scanner(System.in);
    
    System.out.print("This encyption involves taking the first letter of ");
    System.out.print("a String and adding each subsequent letter before a");
    System.out.println("nd after that original first letter.");
    System.out.println("Example: \"STRING\" becomes \"GITSRN\"");
    
    System.out.println("\nType \"0\" to encrypt or \"1\" to decrypt");
    int which = type.nextInt();
    if(which == 0)
    {
      System.out.print("Enter the String that should be encrypted: ");
      String before = type.next();
      System.out.println("Decrypted: " + before);
      System.out.println("Encrypted: " + garrett.encrypt(before));
    }
    
    if(which == 1)
    {
      System.out.print("Enter the String that should be decrypted: ");
      String before = type.next();
      System.out.println("Encrypted: " + before);
      System.out.println("Decrypted: " + garrett.decrypt(before));
    }
  }
}