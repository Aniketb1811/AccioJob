import java.io.*;
import java.util.*;

class Solution {
       static void bubbleSort(int arr[], int n)
    {
        //Write your code here
		int i,j, count = 0;
		for(i=0; i<n; i++){
			boolean swap = false;
			for(j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					swap = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
				}
			}
			if(swap == false){
					break;
				}
		}
		System.out.println(count);
		System.out.println(arr[0]);
		System.out.println(arr[n-1]);
    }  
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.bubbleSort(arr1, n);
    }
}
