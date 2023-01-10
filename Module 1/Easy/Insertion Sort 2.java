import java.util.*;

public class Main {

    public static void insertionSort(int arr[], int n) {
        // write code here
		int i,j;
		for(i=1; i<n; i++){
			int temp = arr[i];
			for(j=i-1; j>=0; j--){
				if(arr[j]>temp){
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				else{
					break;
				}
			}
			arr[j+1] = temp;
			for(int k=0; k<n; k++){
					System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
    }
}
