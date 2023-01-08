import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
 				Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
    		int M = sc.nextInt();
    		int i,j;
    		int[][] mat = new int[N][M];
    
    		for(i=0;i<N;i++)
                {
                  for(j=0;j<M;j++)
                  {
                    mat[i][j] = sc.nextInt();
                  }
                }
 
        // Transpose the matrix
        for (i = 0; i < N; i++)
        {
            for (j = i+1; j < M; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
 
        // swap columns
        for (i = 0; i < N; i++)
        {
            for (j = 0; j < M / 2; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][M - j - 1];
                mat[i][M - j - 1] = temp;
//                 System.out.print(mat[i][j]+" ");
            }
        }
    for(i = 0;i < N; i++)
    {
      for(j = 0; j < M;j++)
      {
        System.out.print(mat[i][j]+" ");
      }
      System.out.print("\n");
    }
    }
	}
