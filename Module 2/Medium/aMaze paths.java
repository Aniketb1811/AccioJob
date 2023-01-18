import java.util.*;
import java.io.*;
public class Main {
    public static void aMazePaths(int n, int m, int sr, int sc, String psf){
       //Write your code here
		if(sr == n && sc == m){
			System.out.println(psf);
			return;
		}
		
		if(sr > n || sc > m) return;
		
		aMazePaths(n , m, sr, sc+1, psf + "h");
		aMazePaths(n , m, sr+1, sc, psf + "v");
    }
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        inputLine = br.readLine().trim().split(" ");
        int m = Integer.parseInt(inputLine[0]);
        aMazePaths(n, m, 1, 1, "");
  }
}
