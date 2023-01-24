import java.util.*;
import java.io.*;

class Solution {
	static void merge(int [] arr, int start, int mid, int end){
		int i = start, j = mid + 1, k = 0;
		int []new_arr = new int[end - start + 1];
		while(i <= mid && j <= end){
			if(arr[i] < arr[j]){
				new_arr[k++] = arr[i++];
			}
			else{
				new_arr[k++] = arr[j++];
			}
		}
		while(i <= mid){
			new_arr[k++] = arr[i++];
		}
		while(j <= end){
			new_arr[k++] = arr[j++];
		}
		
		k = 0;
		for(i = start; i <= end; i++){
			arr[i] = new_arr[k++];
		}
	}
	
	static void mergeSort(int[] arr,int start,int end){
     // Your code here
	if(start >= end) return;
	int mid = (start + end) / 2;
	mergeSort(arr, start, mid);
	mergeSort(arr, mid + 1, end);
	merge(arr, start, mid, end);
}
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
