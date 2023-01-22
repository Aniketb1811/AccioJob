import java.util.*;

public class Main {
    public static char LowerUpper(char ch) {
        //Write your code here
		char c = 'a';
		if(ch >= 'a' && ch<= 'z'){
			c = 'L';
		}
		if(ch >= 'A' && ch<= 'Z'){
			c = 'U';
		}
		return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println(LowerUpper(ch));
    }
}
