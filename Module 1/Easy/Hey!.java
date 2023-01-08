import java.io.*;
import java.util.*;

class Solution {
       static String hey(String str)
      {
           // Your code here
		  return str.replace("e", "ee");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        Solution Obj = new Solution();
        String result = Obj.hey(str);
        System.out.print(result);        
        System.out.println('\n');
    }
}
