import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    printDI(n);
  }

  public static void printDI(int n) {
    // your code here
	  if(n == 0){
      return;
    }
    
    System.out.println(n);
    printDI(n - 1);
    System.out.println(n);
  }
}
