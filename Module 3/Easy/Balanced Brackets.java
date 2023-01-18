import java.util.*;

class Solution{
    public void balancedBrackets(String s, int n) {
        // write code here
		Stack<Character> st = new Stack<>();
		boolean flag = true;
		for(int i = 0; i < n; i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
				st.push(s.charAt(i));
				continue;
			}
			
			if(s.charAt(i) == ')'){
				if(st.isEmpty()){
					st.push(s.charAt(i));
				}
					if(st.peek() == '('){
						st.pop();
					}
				}
			if(s.charAt(i) == ']'){
				if(st.isEmpty()){
					st.push(s.charAt(i));
				}
				if(st.peek() == '['){
						st.pop();
				}
			}
			if(s.charAt(i) == '}'){
				if(st.isEmpty()){
					st.push(s.charAt(i));
				}
				if(st.peek() == '{'){
					st.pop();
				}
			}
		}
		
		if(st.isEmpty()){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
    }
}
