//(c) A+ Computer Science
//www.apluscompsci.com
//Name Garrett Gilliom

import static java.lang.System.*;

public class CountPairs
{
 public static int pairCounter( String str )
 {
  
    int count = 0;

    int strlength = str.length();
    
    for (int tracker = 0; tracker < strlength - 1; tracker++)
    {
    
    if (str.charAt(tracker) == str.charAt(tracker + 1))
    {
      count ++;
    }
    
    }
    
    return count;
}
 
}
 