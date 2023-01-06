import java.util.*;

public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        int count=0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]<=0){
                count++;
            }
        }
        if(count<k){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
