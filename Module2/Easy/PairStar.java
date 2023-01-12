import java.util.*;

public class Main {
    static String PairStar(String str, int index, String res) {
        //Write your code here
        if(index == str.length()-1)
		{
			res += str.charAt(index);
			return res;
		}
		res += str.charAt(index);
		if(str.charAt(index) == str.charAt(index+1)){
			res += "*";
		}
		return PairStar(str, index + 1, res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		String ans = "";
        System.out.println(PairStar(s, 0, ans));
    }
}
