//© A+ Computer Science  -  www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 04/11/19
//Class - APCSA Period 8
//Lab  - APSort

import static java.lang.System.*;
import java.util.Arrays;  //use Arrays.toString() to help print out the array

public class ThreeAPSort
{
 private static int passCount;

 public static void insertionSort(int[] list)
 {
   System.out.println("Insertion Sort");
   System.out.println("Original Data: " + Arrays.toString(list));
   
   int pass, num, key, temp, count = 0;
   
   for(pass = 1; pass < list.length; pass++)
   {
     key = list[pass];
     num = pass - 1;
     while(num >= 0 && key < list[num])
     {
       temp = list[num];
       list[num] = list[num + 1];
       list[num + 1] = temp;
       num--;
     }
   System.out.println("pass " + count + " " + Arrays.toString(list));
   count++;
   }
   
 }
public static void selectionSort(int[] list)
 {
  System.out.println("Selection Sort");
  System.out.println("Original Data: " + Arrays.toString(list));
  
  int pass, spot, minValue, minIndex, temp, count = 0;
  
  for(pass = 0; pass < list.length; pass++)
  {
    minValue = list[pass];
    minIndex = pass;
    for(spot = pass; spot < list.length; spot++)
    {
      if(list[spot] < minValue)
      {
        minValue = list[spot];
        minIndex = spot;
      }
    }
    if(minValue < list[pass])
    {
      temp = list[pass];
      list[pass] = list[minIndex];
      list[minIndex] = temp;
    }
    System.out.println("pass " + count + " " + Arrays.toString(list));
    count++;
  }
 }
 public static void mergeSort(int[] list)
 {
   System.out.println("Merge Sort");
   System.out.println("Original Data: " + Arrays.toString(list));
  
   passCount = 0;
   mergeSort(list, 0, list.length);
 }

 public static void mergeSort(int[] list, int front, int back)  //O( Log N )
 {
   int mid = (front + back) / 2;
   if(mid == front)
     return;
   mergeSort(list, front, mid);
   mergeSort(list, mid, back);
   merge(list, front, back);
   
   System.out.println(Arrays.toString(list));
   
 }

 public static void merge(int[] list, int front, int back)  //O(N)
 {
   System.out.print("pass " + passCount + " ");
   passCount++;
   int dif = back - front;
   int spot = 0;
   int[] temp = new int[dif];
   int beg = front;
   int mid = (front + back) / 2;
   int saveMid = mid;
   while(beg < saveMid && mid < back)
   {
     if(list[beg] < list[mid])
       temp[spot++] = list[beg++];
     else
       temp[spot++] = list[mid++];
   }
   while(beg < saveMid)
     temp[spot++] = list[beg++];
   while(mid < back)
     temp[spot++] = list[mid++];
   for(int num = 0; num < dif; num++)
     list[front + num] = temp[num];
 }
}