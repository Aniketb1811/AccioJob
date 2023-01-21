import java.util.*;

class Solution {
    public void pattern(int row_size) {
        // your code here
		for(int i = 1; i <= 2 * row_size + 1; i++){
			if(i<= row_size+1){
				for(int j = row_size- i +1 ; j > 0; j--){
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print("* ");
			}
			System.out.println();
			}
			else{
				for(int j = 1; j <= i - row_size - 1; j++){
					System.out.print(" ");
				}
				for(int k = row_size; k > i - row_size - 2; k--){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        Solution solution = new Solution();
        solution.pattern(n);
    }
}
