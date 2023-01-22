import java.util.*;

class Accio {
    public int getGoodTriplets(int[] arr, int n, int a, int b, int c) {
        //Write your code here
		// int n = arr.length;
		int count = 0;
		for(int i = 0; i<n-2; i++){
			for(int j = i+1; j<n-1; j++){
				int x = arr[i] - arr[j];
				if(x<0){
					x *= -1;
				}
				if(x <= a){
					for(int k = j+1; k<n; k++){
						int y = arr[j] - arr[k];
						int z = arr[i] - arr[k];
						if(y<0){
							y *= -1;
						}
						if(z<0){
							z *= -1;
						}
							if(y <= b && z <= c){
								// System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
								count++;
							}
					}
				}
			}
		}
		return count;
    }
}

public class Main {
    public static void main(    String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        Accio Obj = new Accio();
        System.out.println(Obj.getGoodTriplets(arr, n, a, b, c));
    }
}
