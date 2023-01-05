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
                long []arr = new long[n];

                for(int i = 0; i<n; i++)
                        arr[i] = sc.nextInt();

        int index = -1;

        for(int i = 0; i<n-1; i++){
            if (i==0){
                if(arr[i]>arr[i+1]){
                    index = i;
                    System.out.print(index);
                    System.exit(0);
                }
        }
           else if (i==n-1){
                if(arr[i]>arr[i-1]){
                    index = i;
                    System.out.print(index);
                    System.exit(0);
                }
        }
        else if (i>0 && i<n-1){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    index = i;
                    System.out.print(index);
                    System.exit(0);
                }
        }
	}
            System.out.println(index);
}
}
