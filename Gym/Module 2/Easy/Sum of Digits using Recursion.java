import java.util.*;
import java.lang.*;

class Solution{
public static int sum = 0;
	
public static int sum_of_digit(int n)
{
  // Your code here
	if(n == 0) return sum;
	
	int rem = n % 10;
	sum += rem;
	sum_of_digit(n/10);
	return sum;
}
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Ob = new Solution();
        System.out.println(Ob.sum_of_digit(n));
    }
}
