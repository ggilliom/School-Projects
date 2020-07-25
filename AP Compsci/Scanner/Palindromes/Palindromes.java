// Name: Garrett Gilliom
// Period: 8

public class Palindromes
{
  
  private String pali, end, word;
  
  public Palindromes()
  {
    setValue("");
  }
  
  public Palindromes(String enter)
  {
    setValue(enter);
  }
  
  public void setValue(String enter)
  {
    pali = enter;
    end = enter;
  }
  
  public void getPali()
  {
    
    String place = "";
    
    String word = "";
    
    pali = pali.replaceAll(" ", "");
    
    pali = pali.toUpperCase();
    
    for (int spot = 0; spot < pali.length(); spot ++)
    {
      
      if (pali.charAt(spot) >= 65 && pali.charAt(spot) <= 90)
      {
        place = pali.charAt(spot) + "";
        
        word = word + place;
      }
      
    }
    System.out.println("Compressed word: " + word);
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
        end = "This string IS a palindrome";
      }
      
      if (check == 1)
      {
        end = "This string is NOT a palindrome";
      }
    
  }
  
  public String toString()
  {
    return end;
  }
  
}