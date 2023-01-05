import java.util.*;

class Solution {
    public int LargestElement(int[] nums, int n) {
        //Write your code here
        int max = nums[0];
        int index = -1;
        for(int i=1; i<n; ++i){
            if(max<nums[i]){
                max = nums[i];
                index = i;
            }
        }

        for(int i=0; i<n; ++i){
            if(index!= i && max< 2*nums[i]){
                return -1;
            }
        }
        return index;
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
        System.out.println(Obj.LargestElement(nums, n));
    }
}
