import java.util.*;
import java.io.*;

public class Main {

    static int downloadTime(int a, int b, int c)
    {
      //Write your code here
		return (c * a + b - 1) / b - c;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        System.out.println(downloadTime(a, b, c));
    }
}
