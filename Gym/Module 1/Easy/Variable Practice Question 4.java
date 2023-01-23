import java.io.*;
import java.util.*;

class Solution {
    public void divide(){
        // Your code here. Declare the variables and print the output here.
		int a = 1042;
		int b = 7;
			int rem = a % b;
		int quo = a / b;
		System.out.print(quo + " " + rem);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution Obj = new Solution();
        Obj.divide();      
        System.out.println('\n');
    }
}
