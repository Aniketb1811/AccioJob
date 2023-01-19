import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1, number=1;
        for(int i=n-1;i>=0;i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            
            for(int j =1; j<=number; j++){
                System.out.print(number);
            }
            row++;
            number+=2;
        System.out.println();  
        }
    }
}
