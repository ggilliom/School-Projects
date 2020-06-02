import java.util.HashSet;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


/**
 * Taking in the path to a dictionary and a text file as command line
 * arguments, CheckSpellings uses SpellCheckerTool to identify all
 * misspelled words in the text file. The dictionary is used to check the
 * spelling of all words in the text file. This program benchmarks the
 * time it takes to evaluate the entire text using two methods of
 * storing the dictionary: a HashSet and an ArrayList.
*/

public class CheckSpellings {
  /**
   * Perform the spell-checking analysis. The path to the dictionary and
   * text file are passed in as command line arguments.
   * @param args the 0th argument is the path to the dictionary.
   * The 1st is the path to the text file.
  */
  public static void main(String[] args) throws IOException, FileNotFoundException {

    SpellCheckerTool checker = new SpellCheckerTool(args[0]);

    List<String> hashCheck = new ArrayList<String>();
    List<String> listCheck = new ArrayList<String>();

    long beforeHash = System.currentTimeMillis();
    hashCheck = checker.hashCheckSpellings(args[1]);
    long afterHash = System.currentTimeMillis();


    long beforeList = System.currentTimeMillis();
    listCheck = checker.listCheckSpellings(args[1]);
    long afterList = System.currentTimeMillis();

    long hashTime = afterHash - beforeHash;
    long listTime = afterList - beforeList;


    System.out.println("Hash time to check: " + hashTime);
    System.out.println("List time to check: " + listTime);

    System.out.println("Misspelled words in text: " + hashCheck.size());  

  }
}
