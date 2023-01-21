import java.io.*;

import java.util.*;

class Accio {
    
    static int fun(int n){
       /// write your code here  
        for(int i=1; i<=5; i++){
            n++;
        }
        return n;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Accio Obj = new Accio();
        System.out.print(Obj.fun(n));
    }
}
