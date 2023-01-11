import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();

        solve(n);

    }

	static void solve(int n)
    {
          // Your code here
		if(n==1){
			System.out.println("ACCIOJOB");
			return;
		}
	
		System.out.println("ACCIOJOB");
		solve(n-1);
		
    }
}
