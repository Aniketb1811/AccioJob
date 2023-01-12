import java.util.*;
import java.util.Scanner;

public class Main{
    static void printSubsequence(String s, String ans, int index) {
        //Write your code here
		if(index == s.length()){
			System.out.print(ans + " ");
			return;
		}
		printSubsequence(s, ans + s.charAt(index), index+1);
		printSubsequence(s, ans , index+1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s, "", 0);
    }
}
