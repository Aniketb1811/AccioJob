import java.io.*;
import java.util.*;

class Solution {
    public void alternateMatrixSum(int [][]mat, int n) {
            // Write your code here
        int sumblack=0;
        int sumwhite=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i+j)%2==0){
                    sumblack+=mat[i][j];
                }
                else{
                    sumwhite+=mat[i][j];
                }
            }
        }
        System.out.println(sumblack);
        System.out.println(sumwhite);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [][]mat=new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.alternateMatrixSum(mat,n);  
        System.out.println('\n');
    }
}
