import java.util.*;

class Solution{
	public static int countKdivPairs(int arr[],int N, int K){
		//Write code here and print
		int count = 0;
		for(int i = 0; i < N-1; i++){
			for(int j = i+1; j < N; j++){
				if((arr[i]+arr[j]) % K == 0){
					count++;
				}
			}
		}
		return count;
    }
}

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
                int[] arr = new int[N];
		for(int i = 0 ; i < N; i++){
			arr[i] = scn.nextInt();
		}
		Solution Obj = new Solution();
                System.out.println(Obj.countKdivPairs(arr,N,K));
        }
}
