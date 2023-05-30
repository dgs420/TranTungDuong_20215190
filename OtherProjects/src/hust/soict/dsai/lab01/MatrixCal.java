package hust.soict.dsai.lab01;
import java.util.Scanner;

public class MatrixCal {
	public static void main(String args[])
	   {
	      int r, c, i, j;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Input number of rows of matrix");
	      r = in.nextInt();
	      System.out.println("Input number of columns of matrix");
	      c  = in.nextInt();
	 
	      int array1[][] = new int[r][c];
	      int array2[][] = new int[r][c];
	      int sum[][] = new int[r][c];
	 
	      System.out.println("Input elements of first matrix");
	 
	      for (  i = 0 ; i < r ; i++ )
	         for ( j = 0 ; j < c ; j++ )
	            array1[i][j] = in.nextInt();
	 
	      System.out.println("Input the second matrix");
	 
	      for ( i = 0 ; i < r ; i++ )
	         for ( j = 0 ; j < c ; j++ )
	            array2[i][j] = in.nextInt();
	 
	      for ( i = 0 ; i < r ; i++ )
	         for ( j = 0 ; j < c ; j++ )
	             sum[i][j] = array1[i][j] + array2[i][j]; 
	 
	      System.out.println("Sum of 2 matrices: ");
	 
	      for ( i = 0 ; i < r ; i++ )
	      {
	         for ( j = 0 ; j < c ; j++ )
	            System.out.print(sum[i][j]+"\t");
	 
	         System.out.println();
	      }
	   }

}
