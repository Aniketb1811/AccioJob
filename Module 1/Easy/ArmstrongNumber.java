import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b, rem, sum=0;

        for(int i = 1; i<=n; i++){
            b = i;
            while(b>0){
            rem = b%10;
            sum = sum + (rem * rem * rem) ;
            b = b/ 10;
        }
            if(sum == i){
                System.out.println(i);
            }
            sum=0;
        }
	}
}
