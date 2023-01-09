import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        //Write your code here and print output here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = a%b;

		switch(n){
			case 0:
				System.out.print("Remainder is too small");
				break;
			case 1:
				System.out.print("Remainder is small");
				break;
			case 2:
				System.out.print("Remainder is large");
				break;
			default:
				System.out.print("Remainder is too large");
				
		}
    }
}
