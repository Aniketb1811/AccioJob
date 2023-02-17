import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        boolean result = true;

        while (h1 <= 10000 && h2<10000 && h1 != h2){
            h1 += v1;
            h2 += v2;
        }
        if(h1 == h2)
            System.out.println("true");
        else
            System.out.println("false");
	}
}
