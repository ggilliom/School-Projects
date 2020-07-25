// Garrett Gilliom
// Period 8

public class EncryptMethods
{
  public String encrypt(String before)
  {
    String after = "";
    int counter = 0;
    boolean check = true;
    for(int spot = 0; spot < before.length(); spot++)
    {
      if(counter % 2 == 0 && check)
      {
        after = after + before.substring(spot, spot + 1);
        counter++;
        check = false;
      }
      if(counter % 2 == 1 && check)
      {
        after = before.substring(spot, spot + 1) + after;
        counter++;
        check = false;
      }
      check = true;
    }
    return after;
  }
  
  public String decrypt(String before)
  {
    String after = "";
    int counter = 0;
    boolean check = true;
    String before2 = before;
    if(before.length() % 2 == 0)
    {
      for(int spot = 0; spot < before.length(); spot++)
      {
        if(counter % 2 == 0 && check)
        {
          after = before2.substring(0,1) + after;
          before2 = before2.substring(1);
          counter++;
          check = false;
        }
        if(counter % 2 == 1 && check)
        {
          after = before2.substring(before2.length() - 1) + after;
          before2 = before2.substring(0, before2.length() - 1);
          counter++;
          check = false;
        }
        check = true;
      }
    }
    
    check = true;
    if(before.length() % 2 == 1)
    {
      for(int spot = 0; spot < before.length(); spot++)
      {
        if(counter % 2 == 0 && check)
          {
            after = before2.substring(before2.length() - 1) + after;
            before2 = before2.substring(0, before2.length() - 1);
            counter++;
            check = false;
          }
        if(counter % 2 == 1 && check)
          {
            after = before2.substring(0,1) + after;
            before2 = before2.substring(1);
            counter++;
            check = false;
          }
          check = true;
      }
    }
    return after;
  }
}