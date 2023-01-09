import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Throwable{
        //Write code here and print output
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n){
			case 12:
				System.out.print("I am even");
				break;
			
			case 13:
				System.out.print("I am prime");
				break;
				
			case 25:
				System.out.print("I am odd");
				break;
			default:
				System.out.print("I am just a number");
				break;
		}
    }
}
