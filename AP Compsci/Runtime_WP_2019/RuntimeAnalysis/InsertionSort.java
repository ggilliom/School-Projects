//Garrett Gilliom and Gavin Shafer

public class InsertionSort
{
  public static void insertionSort(int[] list)
 { 
   for(int j = 1; j < list.length; j ++)
   {
     int temp = list[j];
     int possibleIndex = j;
     while(possibleIndex > 0 && temp < list[possibleIndex-1])
     {
       list[possibleIndex] = list[possibleIndex-1];
       possibleIndex --;
     }
     list[possibleIndex] = temp;
   }

 }
}

//Source: AP Appendix C