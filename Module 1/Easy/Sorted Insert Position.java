import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
  	    
    	  int N = sc.nextInt();
    	  int[] A = new int[N];
    	  for(int i=0;i<N;i++){
          A[i] = sc.nextInt();
    		}
          int B = sc.nextInt();
    	  
    	  Solution Obj = new Solution();
          
        System.out.println(Obj.searchInsert(A,B));
    		  
	}
}
class Solution {

	   public static int searchInsert(int[] a, int b) {
                    //your code goes here
		   int index = a.length;
           for(int i=0; i<a.length; i++){
               if(a[i] == b){
                   index = i;
				   break;
                    // return index;
               }
               if(a[i]>b){
                   index = i;
				   break;
                   // return index;
               }
           }
           return index;
    }
}
