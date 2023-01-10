import java.util.*;

class Accio {
    public int[] SelectionSort(int[] arr) {
        // Write your code here
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			int mini = i;
			for(int j=i+1; j<n; j++){
				if(arr[j]<arr[mini]){
					mini = j;
				}
			}
			int temp = arr[i];
				arr[i] = arr[mini];
				arr[mini] = temp;
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
        int[] ans = Obj.SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}
