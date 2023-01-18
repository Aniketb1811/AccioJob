import java.io.*;
import java.util.*;

public class Main {
    static void printStairPaths(int n, String moves) {
        //Write your code here
		if(n <= 0){
			if(n == 0){
				System.out.println(moves);
			}
			return;
		}
		printStairPaths(n-1, moves + "1");
		printStairPaths(n-2, moves + "2");
		printStairPaths(n-3, moves + "3");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n, "");
    }
}
