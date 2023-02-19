import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		double P = sc.nextDouble();
		double T = sc.nextDouble();
		double R = sc.nextDouble();
		double interest = P * (Math.pow((1 + R / 100), T));
		System.out.println("Compound interest = " + interest);
	}
}
