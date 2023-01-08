import java.util.*;

class Accio{
    static int[][] BooleanMatrixProblem(int m,int n,int[][] arr){
        // write code here
        int row[] = new int[m];
        int col[] = new int[n];

        for (int i = 0; i < m; i++){
            row[i] = 0;
        }

        for (int i = 0; i < n; i++){
            col[i] = 0;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (row[i] == 1){
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        Accio obj = new Accio();
        int[][] ans=obj.BooleanMatrixProblem(m,n,nums);
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
