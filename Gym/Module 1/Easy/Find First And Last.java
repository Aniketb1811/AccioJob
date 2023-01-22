import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Solution.findFirstAndLast(arr, n , x);
        
    
    }
}
class Solution 
{
    static void findFirstAndLast(int[] arr, int n,int x) 
    {
		int index = -1;
       for(int i = 0; i< n; i++){
		   if(arr[i] == x){
			   index = i;
			   break;
		   }
	   }
		System.out.print(index + " ");
		
		index = -1;
       for(int i = n-1; i > 0; i--){
		   if(arr[i] == x){
			   index = i;
			   break;
		   }
	   }
		System.out.print(index + " ");
    }
}
