import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] time = new int[n];
    int count=0;
    
    for(int i=0;i<n;i++)
    {
      time[i] = sc.nextInt();
    }
    int i;
    if(n%2==0)
    {
      for(i = 0; i < n; i++)
      {
          count = count + (time[i+1] - time[i]);
		  i++;
      }
      
      System.out.println(count);
            
    }
    
    else
      System.out.println("still running");
	}
}
