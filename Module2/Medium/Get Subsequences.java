import java.io.*;
import java.util.*;

public class Main {
	public static void getSubsequences(ArrayList<String> res, String str,String temp, int index){
		if(index == str.length()){
			res.add(temp);
			Collections.sort(res);
			return;
		}
		if(index > str.length()) return;

		getSubsequences(res, str, temp + str.charAt(index), index + 1);
		getSubsequences(res, str, temp , index + 1);
	}
    public static ArrayList<String> generateSubsequences(String str)
    {
        // write your code here
		ArrayList<String> res = new ArrayList<>();
		getSubsequences(res, str, "", 0);
		return res;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for(int i=1;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
