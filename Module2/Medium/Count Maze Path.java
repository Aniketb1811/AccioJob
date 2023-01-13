import java.io.*;
import java.util.*;

public class Main{
	static int count = 0;
    static int countMazePath(int n, int m, int i, int j)
    {
        //Write your code here
		if(i == n && j == m){
			count++;
		}
		if(i > n || j > m ){
			return 0;
		}

		countMazePath(n , m, i , j + 1);
		countMazePath(n , m, i + 1, j );
		return count;
    }
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(countMazePath(n, m, 1, 1));
    }
}
