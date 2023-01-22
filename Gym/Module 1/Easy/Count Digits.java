import java.util.*;

public class Main {
    static int numDigits(int num){
        //Write your code here
		int count  = 0;
		while(num > 0){
			count++;
			num /= 10;
		}
		return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numDigits(n));
    }
}
