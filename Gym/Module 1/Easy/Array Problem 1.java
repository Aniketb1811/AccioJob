import java.util.*;

class Accio{
    static int ArrayProblem1(int n, int[] arr){
        // write code here
		int max = 0;
		int index = 0;
		for(int i=0; i<n; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans=obj.ArrayProblem1(n,arr);
        System.out.println(ans);
    }
}
