import java.util.*;

class Accio {
    public void duplicates(int[] arr, int n) {
        // Write code and print output here
		boolean flag = false;
		for (int i = 1; i < n; ++ i) {
            for (int j = 0; j < i; ++ j) {
                if (arr[i] == arr[j]) {
                    flag = true;
					break;
                }
            }
        }
        System.out.print(flag);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        Obj.duplicates(arr,n);
        sc.close();
    }
}
