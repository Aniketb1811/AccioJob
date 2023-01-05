import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                int a, b, i, hcf = 0;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();

      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      System.out.println(hcf);
	}
}
