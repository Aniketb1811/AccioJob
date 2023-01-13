import java.util.*;

public class Main {
	static  String str_map = " abcdefghijklmnopqrstuvwxyz";  
    public static void printEncodings(String str, String temp, int index) {
        // Write your code here
		if(index == str.length()){
			System.out.println(temp);
			return;
		}
		if(str.charAt(index) == '0') return;
		int i = str.charAt(index) - '0';
		printEncodings(str, temp + str_map.charAt(i), index + 1);
		
		if(index < str.length() - 1 && (str.charAt(index) == '1' || str.charAt(index) == '2' && str.charAt(index + 1) <= '6')){
			i = (str.charAt(index) - '0') * 10  + (str.charAt(index + 1) - '0');
			printEncodings(str, temp + str_map.charAt(i), index + 2);
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    printEncodings(str, "", 0);
    }
}
