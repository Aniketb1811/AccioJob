import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Solution s = new Solution();
        s.printPattern(n);
    }
}


class Solution {

    public static void printPattern(int n) {
        for(int i = 1; i <= n; i++){
			for(int j = i; j<= 2 * i - 1; j++){
				System.out.print(j);
			}
			System.out.println();
		}
    }
}
