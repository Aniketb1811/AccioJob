import java.util.*;

class Accio {
    public void AverageCalculator() {
	    //Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int []arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum/n);
    }
}

public class Main {
    public static void main(    String[] args) {

        Accio Obj = new Accio();
        Obj.AverageCalculator();
    }
}
