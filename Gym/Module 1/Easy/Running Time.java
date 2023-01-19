import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.countNumberOfInsertionSortInversions(arr));
    }
}

class Solution {
    static int countNumberOfInsertionSortInversions(int[] arr) {
		int i,j, count =0;
		int n = arr.length;
		for(i=1; i<n; i++){
			int temp = arr[i];
			for(j=i-1; j>=0; j--){
				if(arr[j]>temp){
					arr[j+1] = arr[j];
					arr[j] = temp;
					count++;
				}
				else{
					break;
				}
			}
		}
		return count;
    }
}
