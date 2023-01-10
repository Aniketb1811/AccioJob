import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
        }
		int target = sc.nextInt();
		int res = findtarget(a,n,target);
		System.out.print(res);
    }

	public static int findtarget(int []arr, int n, int t){
		int result = 0;
        for (int i = 0; i < n; i++) {
 
            // If element is smaller then
            // increase the smaller count
            if (arr[i] < t)
                result++;
 
            // If element is equal then increase
            // count only if it occurs before
            // if (arr[i] == t && i < t)
            //     result++;
        }
        return result;
	}
}
