import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        Solution obj=new Solution();
        obj.horizontalN(n);
        obj.verticalN(n);
        
    }
}

class Solution{
    
    static void horizontalN(int n)
    {
          // Your code here
		for(int i =0; i<n; i++){
			System.out.print("* ");
		}
        System.out.println();
    }

    static void verticalN(int n)
    {
        // your code here
        for(int i =0; i<n; i++){
			System.out.println("*");
		}
    }
}
