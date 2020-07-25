//© A+ Computer Science  -  www.apluscompsci.com
//Name - Garrett Gilliom
//Date - 04/11/19
//Class - APCSA Period 8
//Lab  - APSort



public class ThreeAPSortRunner
{
 public static void main( String args[] )
 {
    ThreeAPSort.insertionSort(new int[]{9,5,3,2});
    System.out.println("");

    ThreeAPSort.selectionSort(new int[]{9,5,3,2});
    System.out.println("");

    ThreeAPSort.mergeSort(new int[]{9,5,3,2});
    System.out.println("");


    ThreeAPSort.insertionSort(new int[]{19,52,3,2,7,21});
    System.out.println("");
    
    ThreeAPSort.selectionSort(new int[]{19,52,3,2,7,21});
    System.out.println("");
    
    ThreeAPSort.mergeSort(new int[]{19,52,3,2,7,21});
    System.out.println("");
// add other sorts

    ThreeAPSort.insertionSort(new int[]{68,66,11,2,42,31});
    System.out.println("");
    
    ThreeAPSort.selectionSort(new int[]{68,66,11,2,42,31});
    System.out.println("");
    
    ThreeAPSort.mergeSort(new int[]{68,66,11,2,42,31});
    System.out.println("");
// add other sorts
 }
}