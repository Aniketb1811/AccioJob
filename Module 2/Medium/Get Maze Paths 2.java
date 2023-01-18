import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<String> allPossiblePaths(int i, int j, int n, int m) {
        // write code here
		ArrayList<String> res = new ArrayList<>();
		getPaths(res, i, j, n, m, "");
		return res;
    }
	
    public static void getPaths(ArrayList<String> res, int i, int j, int n, int m, String temp){
		if(n < i || m < j) return;
		if(i == n && j == m){
			res.add(temp);
			return;
		}

		if(i > n || j > m) return;
		
		getPaths(res, i + 1, j, n, m, temp + "h1");
		getPaths(res, i + 2, j, n, m, temp + "h2");
		getPaths(res, i, j + 1, n, m, temp + "v1");
		getPaths(res, i, j + 2, n, m, temp + "v2");
		getPaths(res, i + 1, j + 1, n, m, temp + "d1");
		getPaths(res, i + 2, j + 2, n, m, temp + "d2");
		
	}
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(1, 1, n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}
