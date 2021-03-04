//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.*;
import java.io.*; 

public class WordSearch
{
   private String[][] m;

   public WordSearch( int size, String str )
   {
     int spot = 0;
     m = new String[size][size];
     for(int row = 0; row < size; row++)
     {
       for(int col = 0; col < size; col++)
       {
         m[row][col] = str.substring(spot, spot + 1);
         spot++;
         System.out.print(m[row][col]);
       }
       System.out.println("");
     }
   }

   public boolean isFound( String word )
   {
     for(int row = 0; row < 8; row++)
     {
       for(int col = 0; col < 8; col++)
       {
         if(checkRight(word, row, col) == true)
           return true;
         if(checkLeft(word, row, col) == true)
           return true;
         if(checkUp(word, row, col) == true)
           return true;
         if(checkDown(word, row, col) == true)
           return true;
         if(checkDiagUpRight(word, row, col) == true)
           return true;
         if(checkDiagUpLeft(word, row, col) == true)
           return true;
         if(checkDiagDownRight(word, row, col) == true)
           return true;
         if(checkDiagDownLeft(word, row, col) == true)
           return true;
       }
     }
     return false; 
   }

   public boolean checkRight(String w, int r, int c)
   {
     if(c == 7)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkRight(w.substring(1), r, c + 1);
       }
     return false;
     }
     }
   }

   public boolean checkLeft(String w, int r, int c)
   {
     if(c == 0)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkLeft(w.substring(1), r, c - 1);
       }
     return false;
     }
     }
   }

   public boolean checkUp(String w, int r, int c)
   {
     if(r == 0)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkUp(w.substring(1), r - 1, c);
       }
     return false;
     }
     }
   }

   public boolean checkDown(String w, int r, int c)
   {
     if(r == 7)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkDown(w.substring(1), r + 1, c);
       }
     return false;
     }
     }
   }

   public boolean checkDiagUpRight(String w, int r, int c)
   {
     if(c == 7 || r == 0)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkDiagUpRight(w.substring(1), r - 1, c + 1);
       }
     return false;
     }
     }
   }

   public boolean checkDiagUpLeft(String w, int r, int c)
   {
     if(c == 0 || r == 0)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkDiagUpLeft(w.substring(1), r - 1, c - 1);
       }
     return false;
     }
     }
   }

   public boolean checkDiagDownLeft(String w, int r, int c)
   {
     if(c == 0 || r == 7)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkDiagDownLeft(w.substring(1), r + 1, c - 1);
       }
     return false;
     }
     }
   }

   public boolean checkDiagDownRight(String w, int r, int c)
   {
     if(c == 7 || r == 7)
       return false;
     else
     {
     if(w.length() == 1)
     {
       if(w.equals(m[r][c]))
       {
         return true;
       }
       else
       {
         return false;
       }
     }
     else
     {
       if((w.substring(0,1).equals(m[r][c])))
       {
         return checkDiagDownRight(w.substring(1), r + 1, c + 1);
       }
     return false;
     }
     }
   }

   public String toString()
   {
     return "";
   }
}
