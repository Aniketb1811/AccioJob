import java.io.*;
import java.util.*;

class Main
{

	public static void solve(int n, int i)
    {
        // Your code here
		int num = 1;
		if(i>n) return;

		while(num<=i){
			System.out.print("* ");
			num++;
		}
        System.out.println();
		solve(n, i+1);
    }
	
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		solve(n,1);

    }
}
