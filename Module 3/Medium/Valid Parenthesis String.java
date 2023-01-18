import java.util.*;

class Solution {
    public boolean checkValidString(int n,String s) {
        
        Stack<Integer> brackets, stars;
        brackets = new Stack<>();
        stars = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            char bracket = s.charAt(i);
            
            if(bracket == '('){
                brackets.push(i);
            }
            else if(bracket == '*'){
                stars.push(i);
            }
            else if(!brackets.isEmpty()){
                brackets.pop();
            }
            else if(!stars.isEmpty()){
                stars.pop();
            }
            else{
                return false;
            }
            
        }
        
        while(!brackets.isEmpty() && !stars.isEmpty() && brackets.peek() < stars.peek()){
            brackets.pop();
            stars.pop();
        }
        
        return brackets.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String s = sc.next();
        Solution obj = new Solution();
        boolean ans = obj.checkValidString(n,s);
        if(ans==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
