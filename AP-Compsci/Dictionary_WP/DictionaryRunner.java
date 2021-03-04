import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.File;
// Garrett Gilliom
// Period 8

public class DictionaryRunner
{
  public static void main(String args[]) throws FileNotFoundException
  {
    
    DictionaryMethods garrett = new DictionaryMethods();
    int count = garrett.getCount();
    System.out.println("Level 1 #1: " + count + "\n");
    String[] dict = garrett.getArray(count);
    System.out.println("Level 1 #2: " + garrett.getLongestWord(dict) + "\n");
    System.out.println("Level 1 #3: " + garrett.noVowels(dict) + "\n");
    System.out.println("Level 1 #4: " + garrett.average(count, dict) + "\n");
    System.out.println("Level 1 #5: " + garrett.sameEnd(dict) + "\n");
    System.out.println("Level 3 #2: " + garrett.twoChars(dict) + "\n");
    System.out.println("Level 3 #3: " + garrett.shortDollar(dict) + "\n");
    System.out.println("Level 2 #4: " + garrett.pali(dict) + "\n");
    System.out.println("Level 2 #2: " + garrett.commonLength(dict) + "\n");
    
  }
}