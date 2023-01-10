import java.util.*;

class Accio {
    public int[] SmallestGreaterElements(int[] arr) {
        // Write your code here
		int n = arr.length;
		int []originalArr =Arrays.copyOf(arr, n);
		int []sortedArr = bubbleSort(arr);
		int []res = new int[n];

		for(int j = 0; j < n; j++) {
	        for(int i = 0; i < n; i++) {
	            if(sortedArr[i] == originalArr[j]) {
	                while(i < n  &&  sortedArr[i] == originalArr[j]) {
	                    i++;
	                }
	                if(i < n)
	                    res[j] = sortedArr[i];
	                else
	                    res[j] = -10000000;
	            }
	        }
	    }
		return res;
	}

	public static int[] bubbleSort(int arr[]){
		int n = arr.length;
		for(int i =0; i<n-1; i++){
			for(int j = 0; j< n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        int[] ans = Obj.SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}
