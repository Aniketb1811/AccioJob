import java.io.*;
import java.util.*;

class Solution {
    public int ArrayProblem(int []arr,int k){
            //your code here
		int count  = 0;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] + arr[i+1] == k){
				count++;
			}
		}
		return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        
        Solution Obj = new Solution();
        System.out.println(Obj.ArrayProblem(arr,k)); 
    }
}
