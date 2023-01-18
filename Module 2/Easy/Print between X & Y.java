import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        Solution ob=new Solution();
        printXY(x,y);
        
        
    }

	public static void printXY(int m ,int n){
		if(m>n) return;

		System.out.print(m + " ");
		printXY(m+1, n);
	}
}


class Solution{
    
    public static void printXY(int x,int y){
        // Code here
       }
}
