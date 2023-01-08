import java.io.*;
import java.util.*;

class Solution {
       static String autori(String str){
        // Your code here
		   String []arr = str.split("-");
		   String ans = "";
		   for(int i=0; i<arr.length; i++){
			   ans += arr[i].charAt(0);
		   }
		   return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        Solution Obj = new Solution();
        String result = Obj.autori(str);
        System.out.print(result);        
        System.out.println('\n');
    }
}
