
import java.util.*;

class Solution {
	public static void solve(int []coins, int amt, int n, int sum, String asf, boolean[] used){
		if(sum > amt){
			return;
		}
		else if(sum == amt){
			System.out.println(asf);
			return;
		}
		for(int i = 0; i< coins.length; i++){
			if(used[i] == false){
				used[i] = true;
				solve(coins, amt, n, sum + coins[i], asf + coins[i] + " ", used);
				used[i] = false;
			}
		}
	}
    public static void coinChange(int[] coins, int amt){
        //Write your code here
		int sum = 0;
		int n = coins.length;
		boolean used[] = new boolean[n];
		solve(coins, amt, n, sum, "", used);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();

        Solution Obj = new Solution();
        Obj.coinChange(coins, amt);
    }
}
