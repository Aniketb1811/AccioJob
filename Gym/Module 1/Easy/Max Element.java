
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
		Scanner sc = new Scanner(System.in);
		int max = 0;
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			max = Math.max(max, n);
		}
		
		System.out.println(max);
    }
}
