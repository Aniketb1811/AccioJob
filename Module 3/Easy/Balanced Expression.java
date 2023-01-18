import java.io.*;
import java.util.*;

class Solution{
    boolean expBalanced(String str){
        // write code here
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			
			if(c == '(' || c == '[' || c == '{' )	st.push(c);
			else if(st.isEmpty()) return false;
			else if(c == ')' && st.peek() != '(') return false;
			else if(c == ']' && st.peek() != '[') return false;
			else if(c == '}' && st.peek() != '{') return false;
			else if(c == ')' || c == '}' || c == ']') st.pop();
			
		}
		return st.isEmpty();
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Solution Obj = new Solution();
        System.out.println(Obj.expBalanced(str));
    }
}
