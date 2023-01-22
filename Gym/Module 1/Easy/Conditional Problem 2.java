import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    static void check(int a){
        //Write code here
		if(a>=30){
			System.out.print("more important");
		}
		else{
			System.out.print("less important");
		}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
        int a;
        a=sc.nextInt();
        check(a);        
	}
}
