import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int n = sc.nextInt();

                for(int i=0; i<m; i++){
                        for(int j=0; j<n; j++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
	}
}
