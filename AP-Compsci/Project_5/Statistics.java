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

public class Statistics
{
  
  public int getCount() throws FileNotFoundException
  {
    Scanner file = new Scanner(new File("numbers.txt"));
    
    int num = 0;
    boolean check = true;
    int count = 0;
    
    do
    {
      num = file.nextInt();
      check = file.hasNextInt();
      count++;
    } while(check);
    
    return count;
    
  }
  
  public int[] getArray(int count) throws FileNotFoundException
  {
    
    int[] nums = new int[count];
    
    Scanner file = new Scanner(new File("numbers.txt"));
    
    for (int spot = 0; spot < count; spot++)
    {
     nums[spot] = file.nextInt();
    }
    
    return nums;
    
  }
  
  public double getMean(int[] nums, int count)
  {
    double mean = 0;
    int sum = 0;
    
    for (int item : nums)
    {
      sum = sum + item;
    }
    
    mean = Math.round(((double) sum / (double) count * 100.0)) / 100.0;
    
    return mean;
    
  }
  
  public int getRange(int[] nums)
  {
    
    int range = 0;
    int max = 0;
    int min = 100;
    
    for (int item : nums)
    {
      if (item > max)
      {
        max = item;
      }
      
      if (item < min)
      {
        min = item;
      }
    }
    
    range = max - min;
    
    return range;
    
  }
  
  public int getMode(int[] nums, int spot)
  {
    int total = 0;
    
    for (int item : nums)
    {
      if (item == spot)
      {
        total++;
      }
    }
    
    return total;
    
  }
  
  public double getStandard(int[] nums, double mean, int count)
  {
    
    double standard = 0.0;
    
    double sum = 0.0;
    
    double div = 0.0;
    
    for (int item : nums)
    {
      sum = sum + Math.pow((item - mean), 2);
      
      div = sum / ((double) count - 1);
      
      standard = Math.round(Math.sqrt(div) * 100.0) / 100.0;
    }
    
    return standard;
    
  }
  
}