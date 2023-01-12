import java.io.*;
import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str, int start, int end){
        // Write your code here
		if(start >= end) return true;

		if((str.charAt(start)) != (str.charAt(end))){
			return false;
		}

		if(str.charAt(start) == str.charAt(end)){
			return isPalindrome(str, start + 1, end - 1);
		}
		return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        boolean result=isPalindrome(str, 0, str.length()-1);
        if(result == true)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
