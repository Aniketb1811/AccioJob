import java.io.*;
import java.util.*;
public class Main {
	static int sum = 0;
    public static int sum(int a[], int i){
        // your code here
		if(i < 0) return sum;
		return sum + a[i] + sum(a, i-1);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int testcase = 1; testcase <= testcases; testcase++){
            int n = input.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = input.nextInt();
            }
            System.out.println("Case " + testcase + ": " + sum(a, n - 1));
        }
    }
}
