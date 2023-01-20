import java.io.*;
import java.util.*;
public class Main {
  public static int multiplyRecursively(int n, int m) {
    //Write code here and print output
	  if(m == 1) return n;
	  // int sum = 0;
	  // sum = n + multiplyRecursively(n, m-1);
	  return  n + multiplyRecursively(n, m-1);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int sum = multiplyRecursively(n, m);
	System.out.print(sum);
  }
}
