//Garrett Gilliom and Gavin Shafer

public class MergeSort
{
   public static void mergeSort(int[] list)
 {
   int n = list.length;
   int [] temp = new int [n];
   mergeSortHelper(list, 0, n-1, temp);
 }

 
 public static void mergeSortHelper( int [] list, int from, int to, int [] temp)  //O( Log N )
 {
   if (from < to)
   {
     int middle = (from + to) / 2;
     mergeSortHelper(list, from, middle, temp);
     mergeSortHelper(list, middle+1, to, temp);
     merge(list, from, middle, to, temp);
   }
                      
 }
 
 public static void merge(int[] list, int from, int middle, int to, int [] temp)  //O(N)
 {
   int i = from;
   int j = middle + 1;
   int k = from;


   while( i <= middle && j <= to)
   { 
     if(list[i] < list[j])
     {
       temp[k] = list[i];
       i ++;
     }
     else
     {
       temp[k] = list[j];
       j ++;
     }          
     k ++;
   }
   
   while (i <= middle)
   {
     temp[k] = list[i];
     i ++;
     k ++;
   }
   
   while(j <= to)
   {
     temp[k] = list[j];
     j ++;
     k ++;
   }
   
   for (k = from; k <= to; k++)
   {
     list[k] = temp[k];
   }
   
 }
 
}


//Source: AP Appendix C