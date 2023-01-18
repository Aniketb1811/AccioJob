import java.util.*;
import java.lang.*;
import java.io.*;
class Solution{
    public int reverseInteger(int x) {
        // write code here
		// if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;
		Stack<Integer> st = new Stack<>();
		Stack<Integer> st1 = new Stack<>();
		boolean flag = false;
		if(x < 0) flag = true;
		x = Math.abs(x);
		int temp = x;
		while( temp > 0){
			int rem = temp % 10;
			temp /= 10;
			st.push(rem);
		}
		int ans = 0;
		while(!st.isEmpty()){
			st1.push(st.pop());
		}
		while(!st1.isEmpty()){
			int a = st1.pop();
			ans = ans * 10 + a;
		}
		
		if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 )) return 0;
        if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10)) return 0;
		if(flag == true){
			return ans * -1;
		}
		else{
			return ans;
		}
	}
}

public class Main {
	
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    	int x = sc.nextInt();
            Solution obj = new Solution();
			System.out.println(obj.reverseInteger(x));
	    	
		
	}
}
