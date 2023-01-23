import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String ans=ConditionalProblem6(n,m);
        System.out.println(ans);

		sc.close();
    }
	static String ConditionalProblem6(int n, int m){

		// Your code here
		if(n % 2 == 1 && m % 2 == 1)
			return "we are odd";
		else
			return "we are simple";
    }
}
