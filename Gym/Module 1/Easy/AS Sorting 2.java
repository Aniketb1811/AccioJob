import java.util.*;

class Solution{
        public int[] sort(int[] arr, int N) {
                // write code here
			for(int i =0; i<N-1; i++){
			int mini = i;
				for(int j=i+1; j<N;j++){
					if(arr[j]<arr[mini]){
					int temp = arr[mini];
					arr[mini] = arr[j];
					arr[j] = temp;
				}
				}
			}
			return arr;
        }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Solution Obj = new Solution();
        // selection sort
        Obj.sort(arr, N);
        // printing array elements
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
