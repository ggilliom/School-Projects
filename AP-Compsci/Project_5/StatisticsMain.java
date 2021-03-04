//  Garrett Gilliom
// Period 8

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

public class StatisticsMain
{
  
  public static void main(String args[]) throws FileNotFoundException
  {
    
    Statistics garrett = new Statistics();
    
    int count = garrett.getCount();
    
    System.out.println("# of numbers: " + count);
    
    int[] nums = garrett.getArray(count);
    
    double mean = garrett.getMean(nums, count);
    
    System.out.println("Mean: " + mean);
    
    int range = garrett.getRange(nums);
    
    System.out.println("Range: " + range);
    
    int total = 0;
    int most = 0;
    int mode = 0;
    int mode2 = 0;
    
    for (int spot = 0; spot <= 100; spot++)
    {
      total = garrett.getMode(nums, spot);
      
      if (total > most)
      {
        mode = spot;
        
        most = total;
      }
      
      if(total == most)
      {
        
        mode2 = spot;
        
      }
      
    }
    
    System.out.println("Modes: " + mode + ", " + mode2);
    
    double standard = garrett.getStandard(nums, mean, count);
    
    System.out.println("Standard Deviation: " + standard);
    
  }
  
}