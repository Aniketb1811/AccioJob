import java.util.*;

public class Main {
	static int count = 0;
    static int CountABC(String str, int i) {
        // Write your code here
		if(i+2 == str.length()) return count;
		
        if(str.substring(i, i+3).equals("abc") || str.substring(i, i+3).equals("aba")){
			count++;
		}
		return CountABC(str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s, 0));

    }
}
