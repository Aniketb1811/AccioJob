import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            Solution ob = new Solution();
            long ans[] = ob.sumAndProduct(arr, n); 
            System.out.println(ans[0] + " " + ans[1]);           
        }
    }
}


class Solution{
     static long[] sumAndProduct(long arr[], long n){
        long min = Integer.MAX_VALUE;
		 long max =Integer.MIN_VALUE;
		 long []ans = new long[2];
		 for(int i = 0; i<n; i++){
			 max = Math.max(max, arr[i]);
			 min = Math.min(min, arr[i]);
		 }
		 ans[0] = min + max;
		 ans[1] = min * max;

		return ans;
    }
}
