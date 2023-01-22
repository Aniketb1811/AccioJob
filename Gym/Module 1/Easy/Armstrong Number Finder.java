
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int a  = sc.nextInt();
      int OriginalA = a;
      int temp= 0;
      int sum = 0;
      while(a>0)
      {
        temp = a%10;
        int DigitCube = temp*temp*temp;
        sum = sum + DigitCube;
        a = a/10;
      }
      
      if (sum ==OriginalA)
      {
        System.out.println(1);
      }
      else
      {
        System.out.println(0);
      }
    }
}
