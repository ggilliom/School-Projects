//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.util.*;
import java.io.*; 

public class MatrixSumming
{
  private int[][] m;   //load in the matrix values
  
  public MatrixSumming(int[][] mat)
  {
    m = mat;
  }

  public int sum( int row, int col )
  {
    int total = 0;
    
    if(row > 0 && row < 4 && col > 0 && col < 4)
    {
      for(int spot = row - 1; spot < row + 2; spot++)
      {
        for(int place = col - 1; place < col + 2; place++)
        {
          total += m[spot][place];
        }
      }
    }
    
    if(row == 0 && col != 0 && col != 4)
    {
      for(int spot = 0; spot < 2; spot++)
      {
        for(int place = col - 1; place < col + 2; place++)
        {
          total += m[spot][place];
        }
      }
    }
    
    if(row == 4 && col != 0 && col != 4)
    {
      for(int spot = 3; spot < 5; spot++)
      {
        for(int place = col - 1; place < col + 2; place++)
        {
          total += m[spot][place];
        }
      }
    }
    
    if(col == 0 && row != 0 && row != 4)
    {
      for(int spot = row - 1; spot < row + 2; spot++)
      {
        for(int place = 0; place < 2; place++)
        {
          total += m[spot][place];
        }
      }
    }
    
   if(col == 4 && row != 0 && row != 4)
    {
      for(int spot = row - 1; spot < row + 2; spot++)
      {
        for(int place = 3; place < 5; place++)
        {
          total += m[spot][place];
        }
      }
    }
   
   if(row == 0 && col == 0)
   {
     for(int spot = row; spot < row + 2; spot++)
     {
       for(int place = col; place < col + 2; place++)
       {
         total += m[spot][place];
       }
     }
   }
   
   if(row == 0 && col == 4)
   {
     for(int spot = row; spot < row + 2; spot++)
     {
       for(int place = col - 1; place < col + 1; place++)
       {
         total += m[spot][place];
       }
     }
   }
   
   if(row == 4 && col == 0)
   {
     for(int spot = row - 1; spot < row + 1; spot++)
     {
       for(int place = col; place < col + 2; place++)
       {
         total += m[spot][place];
       }
     }
   }
   
   if(row == 4 && col == 4)
   {
     for(int spot = row - 1; spot < row + 1; spot++)
     {
       for(int place = col - 1; place < col + 1; place++)
       {
         total += m[spot][place];
       }
     }
   }
      
    return total;
  }

  public String toString()
  {
    return "";
  }
}
