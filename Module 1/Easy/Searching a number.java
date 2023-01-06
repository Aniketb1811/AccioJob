import java.io.*;
import java.util.*;

class Solution {
    static int findNumber(int arr[], int n, int k)
    {
	//Your code here
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == k){
                index = i+1;
                break;
            }
        }
        return index;
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
        int result = Obj.findNumber(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}
