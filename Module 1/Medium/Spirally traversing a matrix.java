import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc= new Scanner(System.in);
    int r,c,i,j;
    r= sc.nextInt();
    c= sc.nextInt();
    int top=0, bottom=r-1 , left=0, right=c-1 ;
    int[][] mat = new int[r][c];
    
    for(i = 0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    
//     while(top<bottom && left<right)
//     {
//       for(i=left ; i<=right ; ++i)
//       {
//         System.out.print(mat[top][i]+" ");
//       }
//       top++;
      
//       for(i = top ; i<=bottom ; ++i)
//       {
//         System.out.print(mat[i][right]+" ");
//       }
//       right--;
      
//       if(top<bottom)
//       {
//         for(i=right; i>=left; --i)
//         {
//           System.out.print(mat[bottom][i]+" ");
//         }
//         bottom--;
        
//         if(left<right)
//         {
//         	for(i= bottom; i>=top; --i)
//         	{
//           	System.out.print(mat[i][left]+" ");
//         	}
//         }
//         left++;
//       }
//     }
    
    while (true)
        {
            if (left > right) {
                break;
            }
 
            // print top row
            for (i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
 
            if (top > bottom) {
                break;
            }
 
            // print right column
            for (i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
 
            if (left > right) {
                break;
            }
 
            // print bottom row
            for (i = right; i >= left; i--) {
                System.out.print(mat[bottom][i] + " ");
            }
            bottom--;
 
            if (top > bottom) {
                break;
            }
 
            // print left column
            for (i = bottom; i >= top; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
    }
	}
}
