import java.util.*;

class Accio {
    public void ArrayOperations(int[] arr, int n) {
        // Write your code here
		int sum = 0, avg =0, max = arr[0];
		for(int i= 0; i< n; i++){
			sum += arr[i];
		}
		avg = sum/n;
		for(int i =1; i<n ; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		System.out.print(sum + " " + avg + " " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();


        Accio Obj = new Accio();
        Obj.ArrayOperations(arr, n);
    }
}
