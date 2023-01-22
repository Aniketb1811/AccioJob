import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        // your code here
		ArrayList<String> res = new ArrayList<>();
		getPaths(res, n, "");
		return res;
    }

	public static void getPaths(ArrayList<String> res, int n, String temp){
		if(n <= 0){
			if(n == 0){
				res.add(temp);
			}
			return;
		}
		getPaths(res, n - 1, temp + "1");
		getPaths(res, n - 2, temp + "2");
		getPaths(res, n - 3, temp + "3");
	}
}


                        
                                
