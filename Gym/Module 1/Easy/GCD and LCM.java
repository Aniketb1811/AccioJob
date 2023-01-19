import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static void findGcdLcm(int n, int m){
		int gcd = 1;
		for(int i = 2; i<= n && i<= m; i++){
			if(n % i == 0 && m % i == 0){
				gcd = i;
			}
		}
		System.out.println(gcd);
		System.out.println((n * m)/ gcd);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = sc.nextInt(); 
		findGcdLcm(n , m);
	}
}
