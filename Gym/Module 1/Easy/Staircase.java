import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= n; j++) 
            {
                if ((i + j) > n) 
                {
                    System.out.print("#");
                } 
            		else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
