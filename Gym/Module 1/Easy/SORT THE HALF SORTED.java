import java.io.*;
import java.util.*;

// class Solution
// {
//       static int[] solve(int N, int[] Arr){
//        // Write your code here
//         int[] result = {0};
 
//         return result;
    
//     }
// } 
 
public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[] Arr = new int[N];
         for(int i_Arr = 0; i_Arr < Arr.length; i_Arr++)
         {
         	Arr[i_Arr] = sc.nextInt();
         }

		Arrays.sort(Arr);
		
         for(int i_out_ = 0; i_out_ < Arr.length; i_out_++)
         {
         	System.out.print(Arr[i_out_] + " ");
         }

	}
}
