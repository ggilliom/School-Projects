//(c) A+ Computer Science
// www.apluscompsci.com

//insertion sort example 

import static java.lang.System.*;

public class MergeSort
{
	public static void mergeSort(Comparable[] stuff, int front, int back)
	{
	   int mid = (front+back)/2;
	   if(mid==front) return;
	   mergeSort(stuff, front, mid);
	   mergeSort(stuff, mid, back);
	   merge(stuff, front, back);
	}

		
	public static void merge(Comparable[] stuff, int front, int back)	
	{
		int dif = back-front;
		Comparable[] temp = new Comparable[ dif ];
		int beg = front, mid = (front+back)/2, saveMid = mid;
		int spot = 0;
		while( beg<saveMid && mid<back ) {
		   if(stuff[ beg ].compareTo(stuff[ mid ])<0)
		      temp[ spot++ ]= stuff[ beg++ ];
		   else
		      temp[ spot++ ]= stuff[ mid++ ];
		}		
		while( beg < saveMid ) 
		   temp[ spot++ ]= stuff[ beg++ ];
		while( mid < back ) 
		   temp[ spot++ ]= stuff[ mid++ ];
		for(int i = 0; i < dif; ++i)
		   stuff[front+i]=temp[i];
	}

		
}