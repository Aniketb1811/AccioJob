import java.util.*;
import java.io.*;

class Solution{
        static void insertionSort1(int a[],int n){
        //Write code here and print output
			int temp = a[n-1];
			int i,j;
			for(i = n-2; i>=0; i--){
				if(a[i]>temp){
					a[i+1] = a[i];
				}
				else{
					break;
				}
				for(j=0; j<n; j++){
					System.out.print(a[j] + " ");
				}
				System.out.println();
			}
			a[i+1] = temp;
			for(j=0; j<n; j++){
					System.out.print(a[j] + " ");
			}
        }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }   
        Solution.insertionSort1(a,n);
    }
}
