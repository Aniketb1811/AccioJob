import java.io.*;
import java.util.*;

public class Main {
	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //Write your code here
		if(sr == dr && sc == dc){
			System.out.println(psf);
			return;
		}
		if( sr > dr || sc > dc) return;

		printMazePaths(sr , sc + 1 , dr, dc, psf + "h1");
		printMazePaths(sr , sc + 2 , dr, dc, psf + "h2");
		printMazePaths(sr , sc + 3 , dr, dc, psf + "h3");
		printMazePaths(sr , sc + 4, dr, dc, psf + "h4");
		printMazePaths(sr + 1, sc , dr, dc, psf + "v1");
		printMazePaths(sr + 2, sc , dr, dc, psf + "v2");
		printMazePaths(sr + 3, sc , dr, dc, psf + "v3");
		printMazePaths(sr + 4, sc , dr, dc, psf + "v4");
		printMazePaths(sr + 1, sc + 1, dr, dc, psf + "d1");
		printMazePaths(sr + 2, sc + 2, dr, dc, psf + "d2");
		printMazePaths(sr + 3, sc + 3, dr, dc, psf + "d3");
		printMazePaths(sr + 4, sc + 4, dr, dc, psf + "d4");
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}
