import java.util.*;

public class Main {

    public static void solve(int []arr, int n, int s){
        //Write your code here
		int sum = 0;
		boolean flag = false;
		for(int i = 0; i <= arr.length - n ; i++){
			for(int j = i ; j < n + i; j++){
				sum = 0;
				for(int k = i; k <= j; k++){
					sum += arr[k];
				}
			}
			if(sum == s){
				flag = true;
			}
		}
		// System.out.println(sum);
		if(flag == true){
			System.out.print("YES");
		}
		else{
			System.out.println("NO");
		}
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int n;
        n = sc.nextInt();
        int s;
        s = sc.nextInt();
        solve(arr, n, s);
    }
}

