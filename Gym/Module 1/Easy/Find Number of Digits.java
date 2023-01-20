import java.util.*;

public class Main {
	static int count =0;
	static int numOfDigi(int n) {
        //Write code here
		if(n == 0) return count;

		if(n>0){
			count += 1;
			n /= 10;
		}
		return numOfDigi(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = numOfDigi(n);
        System.out.println(result);
        sc.close();
    }
}
