import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int marks  = sc.nextInt();
                if(marks>90)
                        System.out.println("Excellent");
                if(80<marks && marks<=90)
                        System.out.println("Good");
                if(70<marks  && marks<=80)
                        System.out.println("Fair");
                if(60<marks  && marks<=70)
                        System.out.println("Meets Expectations");
                if(marks<=60)
                        System.out.println("Below Expectations");
	}
}
