import java.util.*;

public class Main {
	static String res = "";
    static String noX(String s, int index) {
        // Write your code here
        if(index == s.length()) return res;

		if(s.charAt(index) != 'x'){
			res += String.valueOf(s.charAt(index));
		}

		noX(s, index+1);
		return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s, 0));
    }
}
