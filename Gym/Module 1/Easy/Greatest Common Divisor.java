import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static int gcd(int m, int n) {
        //Write your code here
		int div = 1;
		for(int i = 2; i< m&& i<n; i++){
			if(m % i == 0 && n % i == 0){
				div = i;
			}
		}
		return div;
    }
}
public class Main {
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(Solution.gcd(m, n));
	}
}
