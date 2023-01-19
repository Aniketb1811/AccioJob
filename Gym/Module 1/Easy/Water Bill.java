import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    if(n<=100)
      sum = n*15;
    
    if(n<=200)
      sum = 1500 + (n-100)*14;
    
    else
      sum = 2900 + (n-200)*12;
    
    System.out.println(sum);
	}
}
