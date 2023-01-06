import java.io.*;
import java.util.*;

class Solution {
        static int subarrayDivisbleByK(int arr[], int n, int k){
            //Write your code here
            int count=0;
            for(int i = 0; i<n; i++){
                int sum = 0;
                    for(int j = i; j<n; j++){
                        sum += arr[j];
                        if(sum%k==0){
                                count++;
                        }
                    }
            }
            return count;
        }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        int result = Obj.subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}
