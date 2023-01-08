import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [][] matrix = new int[n][n];
    int [][] temp = new int[n][n];
    int i,j;
    
    for(i=0; i<n; i++)
    {
      for(j=0; j<n; j++)
      {
       	matrix[i][j] = sc.nextInt();
      }
    }
    
    for(i=0; i<n; i++)
    {
      for(j=0; j<n; j++)
      {
//        	int temp[i][j] = matrix[j][i];
         System.out.print(matrix[j][i]+" ");
      }
      System.out.print("\n");
    }
	}
}
