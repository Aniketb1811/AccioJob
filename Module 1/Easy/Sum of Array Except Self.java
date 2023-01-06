import java.util.*;

class Solution{
    public int[] SumArrayExpectSelf(int[] nums, int n) {
        //Write your code here
        int sum = 0;
        int []ans = new int[nums.length];
        for(int i=0; i<n; i++){
        sum = 0;
            for(int j=0; j<n; j++){
                if(i!=j){
                    sum += nums[j];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        int[] Ans = Obj.SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }
}
