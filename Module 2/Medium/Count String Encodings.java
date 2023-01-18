import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(countEncodings(str, 0, ""));
  }

  static String str_map = " abcdefghijklmnopqrstuvwxyz";
	static int count = 0;
	static ArrayList<String> arr = new ArrayList<>();
  public static int countEncodings(String str, int index, String ans) {
    // your code here
	  if(index == str.length()){
		  arr.add(ans);
		  return 1;
		}

		if(str.charAt(index) == '0') return 0;

	  int i = str.charAt(index) - '0';
	  countEncodings(str, index + 1, ans + str_map.charAt(i));

	  if(index < str.length() - 1 && (str.charAt(index) == '1') || (str.charAt(index) == '2' && str.charAt(index + 1) <= '6')){
		  i = (str.charAt(index) - '0') * 10 + (str.charAt(index + 1) - '0');
		  countEncodings(str, index + 2, ans + str_map.charAt(i));
	  }
	  return arr.size();
  }
}
