import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
	static int [] NthSmallerOnLeftIdx(long [] arr, int n){
		int []left = new int[n];
		Stack<Integer> st1= new Stack<>();
		for(int i = n-1; i >= 0; i--){
			if(st1.isEmpty()){
				st1.push(i);
			}
			else{
				while(st1.size() > 0 && arr[i] < arr[st1.peek()]){
					int index = st1.pop();
					left[index] = i;
				}
				st1.push(i);
			}
		}

		while(st1.size() > 0){
			int index = st1.pop();
			left[index] = -1;
		}
		return left;
	}

	static int [] NthSmallerOnRightIdx(long [] arr, int n){
		int []right = new int[n];
		Stack<Integer> st2= new Stack<>();
		for(int i = 0; i < n; i++){
			if(st2.isEmpty()){
				st2.push(i);
			}
			else{
				while(st2.size() > 0 && arr[i] < arr[st2.peek()]){
					int index = st2.pop();
					right[index] = i;
				}
				st2.push(i);
			}
		}

		while(st2.size() > 0){
			int index = st2.pop();
			right[index] = n;
		}
		return right;
	}
      public static long maximumArea(long hist[], long n){
	//Your code here  
		  int []right = NthSmallerOnRightIdx(hist, (int) n);
		  int []left = NthSmallerOnLeftIdx(hist, (int) n);

		  long maxArea = 0;
		  for(int  i = 0; i < n; i++){
			  long height = hist[i];
			  long width = right[i] - left[i] - 1;
			  maxArea = Math.max(maxArea, height * width);
		  }
		  return maxArea;
    }
}



