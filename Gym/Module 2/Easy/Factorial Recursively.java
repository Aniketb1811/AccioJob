import java.util.*;

class Solution {
    static Long factorial(int n)
    {
        //Write your code here
		if(n == 0) return (long) 1;

		return n * factorial(n-1);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.factorial(n));
    }
}
