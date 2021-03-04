import java.util.HashSet;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.io.*;

/**
 * This class is a basic Spell Checker. Using a dictionary provided, it
 * allows for all words in a given text to be checked against that
 * dictionary. If a word is in the text but not in the dictionary it is
 * misspelled
*/
public class SpellCheckerTool {

  private HashSet<String> hashedDictionary;
  private ArrayList<String> listDictionary;
  
  /**
   * Instantiate this SpellCheckerTool.
   * @param dictionaryFileName the dictionary to use for testing
   * spellings
  */
  public SpellCheckerTool(String dictionaryFileName) throws IOException { // constructor

    FileInputStream dict = new FileInputStream(dictionaryFileName);

    hashedDictionary = new HashSet<String>();
    listDictionary = new ArrayList<String>();

    Scanner input = new Scanner(dict);

    String temp = "";

    do{
      temp = input.nextLine();

      listDictionary.add(temp);
      hashedDictionary.add(temp);
    } while(input.hasNextLine());

    System.out.println("Words in dictionary: " + hashedDictionary.size());
  }


  /**
   * Return a list of all misspelled words in the text file. A word is
   * misspelled if it is in the text file but not in the dictionary. This
   * method removes all leading and trailing whitespace and punctuation
   * from the words in the text
   * @param textFileName the name of the text file
   * @return a list of all misspelled words in this text file.
  */
  public List<String> hashCheckSpellings(String textFileName) throws FileNotFoundException {

    ArrayList<String> misspelled = new ArrayList<String>();

    FileInputStream text = new FileInputStream(textFileName);
    Scanner input = new Scanner(text);

    String current = "";

    do{
      current = input.next();
      current = current.replaceAll("[^a-zA-Z+]", "");
      current = current.toLowerCase();
      current = current.trim();

      if(!(hashedDictionary.contains(current)) && !(current.equals(""))){
        misspelled.add(current);
      }
    } while(input.hasNext());

    return misspelled;
  }


  /**
   * Return a list of all misspelled words in the text file. A word is
   * misspelled if it is in the text file but not in the dictionary. This
   * method removes all leading and trailing whitespace and punctuation
   * from the words in the text
   * @param textFileName the name of the text file
   * @return a list of all misspelled words in this text file.
  */
  public List<String> listCheckSpellings(String textFileName) throws FileNotFoundException {

    ArrayList<String> misspelled = new ArrayList<String>();

    FileInputStream text = new FileInputStream(textFileName);
    Scanner input = new Scanner(text);

    String current = "";

    do{
      current = input.next();
      current = current.replaceAll("[^a-zA-Z+]", "");
      current = current.toLowerCase();
      current = current.trim();

      if(!(listDictionary.contains(current)) && !(current.equals(""))){
        misspelled.add(current);
      }
    } while(input.hasNext());

    return misspelled;
  }
}
