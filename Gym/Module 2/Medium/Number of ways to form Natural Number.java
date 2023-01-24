import java.io.*;
import java.util.*;
public class Main {
	static int count = 0;
    public static long ways(int n, int i){
//Write your code here
		if(i > n){
			return 0;
		}
		if(n == i){
			return 1;
		}
		return ways(n - i, i+1) + ways(n, i+1);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1));
    }
}
