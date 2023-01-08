import java.util.*;

public class Main {
    public static void printPattern2(int n) {
        //Write code here
		int l = 65;

		for(int i =0; i < n; i++){
			l += i;

			for(int j = 0; j <= i; j++){
				int let = l + j;
				if(let > 90){
					let = (let % 90) + 64;
				}
				System.out.print((char)(let));
			}
			System.out.println();
			l = 65;
		}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printPattern2(n);
        sc.close();
    }
}
