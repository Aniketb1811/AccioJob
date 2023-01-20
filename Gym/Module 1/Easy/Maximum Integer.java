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
    int p = sc.nextInt();
    int k = sc.nextInt();
    
    if(n>p && n>k)
      System.out.println(n);
    
    else if(p>n && p>k)
      System.out.println(p);
     
    else
      System.out.println(k);
	}
}
