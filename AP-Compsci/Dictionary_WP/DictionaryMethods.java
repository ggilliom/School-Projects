import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.File;

// Garrett Gilliom
// Period 8

public class DictionaryMethods
{
  public int getCount() throws FileNotFoundException
  {
    Scanner text = new Scanner(new File("dictionary.txt"));
    String word = "";
    boolean check = true;
    int count = 0;
    
    do
    {
      word = text.nextLine();
      check = text.hasNextLine();
      count++;
    } while(check);
    
    return count;
  }
  
  public String[] getArray(int count) throws FileNotFoundException
  {
    String[] words = new String[count];
    Scanner text = new Scanner(new File("dictionary.txt"));
    
    for(int spot = 0; spot < count; spot++)
    {
      words[spot] = text.nextLine();
    }
    
    return words;
  }
  
  public String getLongestWord(String[] dict)
  {
    String longest = "";
    int size = 0;
    
    for(String word : dict)
    {
      if(word.length() > size)
      {
        longest = word;
        size = word.length();
      }
      if(word.length() == size && !word.equals(longest))
      {
        longest = longest + ", " + word;
      }
    }
    
    return longest;
  }
  
  public String noVowels(String[] dict)
  {
    String none = "";
    boolean check = false;
    boolean checkY = false;
    int checker = 0;
    for(String word : dict)
    {
      for(int spot = 0; spot < word.length(); spot++)
      {
        if(word.charAt(spot) == 'a' || word.charAt(spot) == 'e' || word.charAt(spot) == 'i' || word.charAt(spot) == 'o' || word.charAt(spot) == 'u')
        {
          check = true;
        }
      }
      if(!check)
      {
        none = none + " " + word;
        for(int place = 0; place < word.length(); place++)
        {
          if(word.charAt(place) == 'y')
          {
            checkY = true;
          }
          if(!checkY)
          {
            checker++;
          }
        }
      }
      check = false;
    }
    if(checker > 0)
    {
      none = none + "; Yes";
    }
    return none;
  }
  
  public double average(int count, String[] dict)
  {
    double sum = 0.0;
    double avg = 0.0;
    for(String word : dict)
    {
      sum += (double) word.length();
    }
    
    avg = sum / (double) count;
    avg = (Math.round(avg * 100.00)) / 100.00;
    
    return avg;
  }
  
  public int sameEnd(String[] dict)
  {
    int count = 0;
    for(String word : dict)
    {
      if(word.charAt(0) == word.charAt(word.length() - 1))
      {
        count++;
      }
    }
    return count;
  }
  
  public String twoChars(String[] dict)
  {
    char one = ' ';
    char two = ' ';
    boolean check = true;
    boolean change = true;
    int count = 0;
    String longer = "";
    for(String word : dict)
    {
      if(word.length() == 4)
      {
        one = word.charAt(0);
        for(int spot = 1; spot < word.length(); spot++)
        {
          if(word.charAt(spot) != one && change)
          {
            two = word.charAt(spot);
            change = false;
          }
          if(word.charAt(spot) != one && word.charAt(spot) != two)
          {
            check = false;
          }
        }
        if(check)
        {
          count++;
        }
      }
      check = true;
      change = true;
    }
    
    for(String word : dict)
    {
      if(word.length() > 4)
      {
        one = word.charAt(0);
        for(int spot = 1; spot < word.length(); spot++)
        {
          if(word.charAt(spot) != one && change)
          {
            two = word.charAt(spot);
            change = false;
          }
          if(word.charAt(spot) != one && word.charAt(spot) != two)
          {
            check = false;
          }
        }
        if(check)
        {
          longer = "Yes";
        }
      }
      check = true;
      change = true;
    }
    return "" + count + "; " + longer;
  }
  
  public String shortDollar(String[] dict)
  {
    String shortest = "";
    String dollar = "";
    int sum = 0;
    boolean first = true;
    for(String word : dict)
    {
      for(int spot = 0; spot < word.length(); spot++)
      {
        sum += (word.charAt(spot) - 96);
        if(sum == 100)
        {
          dollar = word;
          if(dollar.length() < shortest.length() || first)
          {
            shortest = dollar;
            first = false;
          }
        }
      }
      sum = 0;
    }
    return shortest;
  }
  
  public String pali(String[] dict)
  {
    String list = "";
    String place = "";
    String word = "";
    
    for(String pali : dict)
    {
      word = pali;
      int check = 0;
      
      for (int spot = 0; spot < word.length() / 2; spot ++)
      {
        if (word.charAt(spot) != word.charAt(word.length() - (1 + spot)))
        {
          check = 1;
        }
      }
      
      if (pali.length() == 1)
      {
        check = 1;
      }
      
      if (check == 0)
      {
        list = list + pali + " ";
      }
    }
    return list;
  }
  
  public String commonLength(String[] dict)
  {
    int count = 0; // counts the amount of times a word is of length "length"
    String longest = "antidisestablishmentarianism";
    int most = 0; // stores the count of the most common length
    int common = 0; // most common word length
   
    for(int length = 1; length <= longest.length(); length++) // length is current word length
    {
      for(String word : dict)
      {
        if(word.length() == length)
        {
          count++;
        }
      }
      if(length == 1)
      {
        common = length;
        most = count;
      }
      else
      {
        if(count > most)
        {
          common = length;
          most = count;
        }
      }
      count = 0;
    }
    return "" + common + ", " + most;
  }
}