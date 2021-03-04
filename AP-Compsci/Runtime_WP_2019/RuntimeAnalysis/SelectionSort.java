//Garrett Gilliom and Gavin Shafer

public class SelectionSort
{
  public static void selectionSort(int[] list)
 {
  for(int j = 0; j < list.length-1; j++)
  {
    int minIndex = j;
    for(int k = j + 1; k < list.length; k++)
    {
    if (list [k] < list[minIndex])
    {
      minIndex = k;
    }
 }
  int temp = list[j];
  list[j] = list[minIndex];
  list[minIndex] = temp;
}
}
}

//Source: AP Appendix C
