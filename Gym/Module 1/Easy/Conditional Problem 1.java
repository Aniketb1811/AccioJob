import java.io.*;
import java.util.*;

public class Main {
    static void conditionalProblem1(int n)
    {
        // write code here
       if(n==28)
		   System.out.print("i am young");
		else
		   System.out.print("i am not young");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        conditionalProblem1(n);
    }
}
