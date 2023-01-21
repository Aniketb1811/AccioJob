import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

	static void getPaths(ArrayList<String> ans, int sr, int sc, int dr, int dc, String temp){
		if(sr == dr && sc == dc){
			ans.add(temp);
			return;
		}

		if(sr > dr || sc > dc)return;

		getPaths(ans, sr, sc + 1, dr, dc, temp + "h");
		getPaths(ans, sr + 1, sc, dr, dc, temp + "v");
	}
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
       // your code here
		ArrayList<String> ans = new ArrayList<String>();
		getPaths(ans, sr, sc, dr, dc, "");
		return ans;
    }
}
