import java.util.*;
class Main{
    public static void diamondPattern(int n) {
        //Write code here
		for(int i = 1; i<= n/2 + 1; i++){
			for(int j = 0; j<= n - i - i ; j++){
					System.out.print(" ");
				}
				for(int k = 1; k <= 2 * i - 1; k++){
					System.out.print("* ");
				}
				System.out.println();
		}
		int k = 1;
		for (int j = 1; j<= n/2; j++){
	         for (int i = 1; i<= k; i++){
	            System.out.print("  ");
	         }
	         k++;
	         for (int i = 1; i<= n - j - j; i++){
	            System.out.print("* ");
	         }
	         System.out.println("");
	      }
    }
	public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				diamondPattern(n);
				t--;
			}
		}
	}

}
