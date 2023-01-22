import java.io.*;
import java.util.*;

class Solution {
    public int findElement(int[] arr, int n) {
        // Write your code here
		int []leftMax = new int[n];

		leftMax[0] = Integer.MIN_VALUE;
		int rightMin = Integer.MAX_VALUE;
		for(int i = 1; i<n; i++){
			leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
		}

		for(int j = n-1; j>=0; j--){
			 if (leftMax[j] < arr[j] && rightMin > arr[j]){
				 return j;
			 }

			rightMin = Math.min(arr[j], rightMin);
		}
		return -1;
    }
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

        Solution Obj = new Solution(); 
		System.out.println(Obj.findElement(nums, n));
	}
}
