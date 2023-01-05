import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt(), reversed = 0;
                while(n != 0 )
                        {
                                int reminder = n %10;
                                reversed = reversed*10 + reminder;
                                n /= 10;
                        }
                System.out.println(reversed);
	}
}
