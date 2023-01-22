import java.util.*;

class Solution {
    public long NumberSum(long N) {
        //Write your code here
		long sum = N * (N+1) / 2; 
		return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        Solution Obj = new Solution();
        System.out.println(Obj.NumberSum(N));
    }
}
