import java.util.*;

class Solution {
    public void printElementsAlternately(int[][] mat,int m,int n) {
        //Write code here and print output
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while(bottom>=top){
            if(bottom>=top){
                for(int i=left;i<=right;i++){
                    System.out.print(mat[top][i] + " ");
                }
            }
            top++;

            if(bottom>=top){
                for(int i=right; i>=left; i--){
                    System.out.print(mat[top][i] + " ");
                }
            }
            top++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printElementsAlternately(mat,m,n);
       
        sc.close();
    }
}

