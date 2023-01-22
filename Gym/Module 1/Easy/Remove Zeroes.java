import java.io.*;
import java.util.*;
public class Main {
    static int removeZeros(String s)
    {
        //Write your code here
		if(s.length() == 1) return 0;
		int count = 0;
		int start = s.indexOf('1');
		int end = 0;
		for(int i = s.length() - 1; i > 0; i--){
			if(s.charAt(i) == '1'){
				end = i;
				break;
			}
		}
		for(int i = start; i <= end; i++){
			if(s.charAt(i) == '0'){
				count++;
			}
		}
		return count;
		
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int test=input.nextInt();
        for(int t=0; t<test; t++){
            String s=input.next();
            System.out.println(removeZeros(s));
        }
    }
}
