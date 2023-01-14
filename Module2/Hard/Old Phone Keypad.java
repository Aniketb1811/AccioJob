import java.util.*;

class Main {
	static String[] keypad = {"ABC", "DEF", "GHI","JKL","MNO", "PQRS", "TU", "VWX", "YZ"};

	public static void getStrings(ArrayList<String> res, int n, int[] keys, String temp, int index){
		if(index == keys.length){
			res.add(temp);
			return;
		}
		if(index>keys.length) return;

		String str_at_digit = keypad[keys[index]-1];
		for(int i = 0; i < str_at_digit.length(); i++){
			getStrings(res, n, keys, temp + str_at_digit.charAt(i), index + 1);
		}
	}
    static ArrayList <String> OldPhone(int n, int[] keys){
		//Write your code here
		ArrayList<String> res = new ArrayList<>();
		getStrings(res, n, keys, "", 0);
		return res;
    }
	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        ArrayList <String> ans=OldPhone(n,keys);
        for(String i:ans) System.out.print(i+" ");
    }
}
