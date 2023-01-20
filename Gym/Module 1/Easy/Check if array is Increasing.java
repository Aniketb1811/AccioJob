import java.util.*;

class Accio {
    public void strictlyIncreasing(int[] arr, int n) {
        //Write code and print output here
		int count=1;
		int max = arr[0];

		for(int i=1; i<n; i++){
			if(arr[i]>max){
				count++;
				max = arr[i];
			}
		}
		if(count == n){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();
            Accio Obj = new Accio();
            Obj.strictlyIncreasing(arr,n);
            t--;
        }
        sc.close();
    }
}
