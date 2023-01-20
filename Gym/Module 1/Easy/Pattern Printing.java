import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
	
	//Write code here
	  for(int i = 0; i < n; i++){
		  for(int j = 1; j <= n; j++){
			  if(i+1 == j || i + j == n){
				  System.out.print("*");
			  }
			  else{
				  System.out.print(" ");
			  }
		  }
		System.out.println();
	  }
  }
}
