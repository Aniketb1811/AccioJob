import java.util.Scanner;

public class Main {
	static int count = 0;
    static int countX(String str, int i, int n) {
        //Write your code here
		if(i == n) return count;

		if(str.charAt(i) == 'x'){
			count++;

		}
		return countX(str, i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        System.out.println(countX(str,0,n));
    }
}
