import java.util.*;

class Accio{
    static long MarcsCakewalk(int n,int[] cupcakes){
        //write code here
		Arrays.sort(cupcakes);
		long miles = 0;
		long mul = 1;
		for(int i = 0; i < n; i++){
			mul = 1;
			for(int j = n - i - 1; j > 0; j--){
				mul *= 2;
			}
			miles += mul * cupcakes[i];
		}
		return miles;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        long ans=obj.MarcsCakewalk(n,arr);
        System.out.println(ans);
    }
}
