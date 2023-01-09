import java.util.*;

class Accio {
    static String ModifyName(String name) {
        // Your Code Here
		return (name + " is a Super Hero");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Accio obj = new Accio();
        System.out.println(obj.ModifyName(name));
        
    }
}
