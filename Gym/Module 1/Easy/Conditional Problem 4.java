import java.util.*;

class Accio{
    static String ConditionalProblem4(char c){
        //write code here
		String res = "";
		if(c == 'A')
			res = "I am the first letter";
		else if(c == 'B')
			res = "I am the second letter";
		else if(c == 'C')
			res = "I am the third letter";
		else if(c == 'D')
			res = "I am the fourth letter";
		else if(c == 'E')
			res = "I am the fifth letter";
		else
			res = "I don't belong here";

		return res;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Accio obj = new Accio();
        String ans=obj.ConditionalProblem4(c);
        System.out.println(ans);
    }
}
