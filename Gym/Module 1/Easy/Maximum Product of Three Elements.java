import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result= Obj.maxProd(arr1, n);
        System.out.print(result + " ");       
        System.out.println('\n');
    }
}
class Solution{
    static int maxProd(int arr[], int n)
    {
// Your code here
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		max = Math.max(max, arr[0] * arr[1] * arr[n-1]);
		max = Math.max(max, arr[n-3] * arr[n-2] * arr[n-1]);
		return max;
}
}
