//assumes array is already sorted!

public class BinarySearch
{
  public static int findVal(int[] arr, int val)
  {
    int bot = 0;
    int top = arr.length - 1;
    while(bot <= top)
    {
      int mid = (bot + top)/2;
      if(arr[mid] == val) return mid;
      else if ( arr[mid] < val) bot = mid + 1;
      else top = mid -1;
    }
    return -1;
  }
}