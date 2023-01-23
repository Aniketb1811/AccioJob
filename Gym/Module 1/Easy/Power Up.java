import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int ans = 1;
		for(int i =1; i<= p; i++){
			ans *= n;
		}
		System.out.print(ans);
    }
}
