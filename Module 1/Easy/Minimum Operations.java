import java.util.*;

class Accio {
    public void minOperations(int[] arr) {
        // Write code and print output here
		int maxfreq = 0, freq =0;
		for(int i=0; i<arr.length; i++){
			freq = 0;
			for(int j=i ; j<arr.length; j++){
				if(arr[i]==arr[j]){
					freq++;
					if(freq>maxfreq){
						maxfreq = freq;
					}
				}
			}
		}
		System.out.println(arr.length-maxfreq);
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
            Obj.minOperations(arr);
            t--;
        }
        sc.close();
    }
}
