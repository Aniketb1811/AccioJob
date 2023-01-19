import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static void printPattern(int n){

		int num = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <=  i; j++){
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}
}
