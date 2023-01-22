import java.util.*;

class Accio{
    static String ConditionalProblem3(int n){
        //write code here
		String ans = "";
		if(n>1){
			ans += "You entered more";
		}
		else
			ans += "You entered less";

		return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio obj = new Accio();
        String ans=obj.ConditionalProblem3(n);
        System.out.println(ans);
    }
}
