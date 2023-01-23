import java.util.*;

class Accio {

    public int lastIndexOfOne(String S) {
        // Write your code here
		int index = -1;
		int maxIndex = -1;
		for(int i = 0; i<S.length(); i++){
			if(S.charAt(i)=='1'){
				index = i;
			}
			if(index>maxIndex){
				maxIndex = index;
			}
		}
		return maxIndex;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Accio Obj = new Accio();
        System.out.println(Obj.lastIndexOfOne(S));
    }
}
