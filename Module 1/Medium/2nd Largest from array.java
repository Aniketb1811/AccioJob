import java.io.*;
import java.util.*;

class Solution {
    public void SecondLargest(int[] arr, int n) {
        //Write your code here
     int max = arr[0], large = arr[n-1], index = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }

        for(int i=0; i<n; i++){
            if(index!= i){
                 if(arr[i]>large){
                     large = arr[i];
                 }
            }
        }
        System.out.println(large);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
      	int[] arr= new int[n];

      	for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        
        Solution Obj = new Solution();
        Obj.SecondLargest(arr,n);
        sc.close();
        
    }
}
