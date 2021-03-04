//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Garrett Gilliom

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner
{
 public static void main( String args[] ) throws IOException
 {
   Scanner file = new Scanner (new File("matsum.dat"));
   
   int[][] mat = new int[5][5];
   
   MatrixSumming garrett = new MatrixSumming(mat);
   
   int holder = file.nextInt();
   
   mat[0][0] = 1; mat[0][1] = 2; mat[0][2] = 3; mat[0][3] = 4; mat[0][4] = 5;
   mat[1][0] = 6; mat[1][1] = 7; mat[1][2] = 8; mat[1][3] = 9; mat[1][4] = 0;
   mat[2][0] = 6; mat[2][1] = 7; mat[2][2] = 1; mat[2][3] = 2; mat[2][4] = 5;
   mat[3][0] = 6; mat[3][1] = 7; mat[3][2] = 8; mat[3][3] = 9; mat[3][4] = 0;
   mat[4][0] = 5; mat[4][1] = 4; mat[4][2] = 3; mat[4][3] = 2; mat[4][4] = 1;
   
   while(file.hasNextInt())
   {
     int row = file.nextInt();
     int col = file.nextInt();
     System.out.println("The sum of " + row + "," + col + " is " + garrett.sum(row, col));  
   }
   // reference slideshow 13 for help on file input 
  }
}


