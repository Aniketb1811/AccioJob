import java.util.*;

class Solution{

    static int FrequencyofDigits(long n, int d) {
       int count = 0;

		while(n>0){
			if(n%10 == d){
				count++;
			}
				n = n/10;
		}
		return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.FrequencyofDigits(n, d));
    }
}
