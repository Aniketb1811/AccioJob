import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                for(int i = 0; i< n; i++){
                        for(int j=n-i; j>1; j--){
                                System.out.print(" ");
                        }
                        for (int k=0; k<=i; k++ )   {        
                                System.out.print("* ");   
                        }
                        System.out.println();  
                }
	}
}
