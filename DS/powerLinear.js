import java.io.*;
import java.util.*;

public class powerLinear {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(power(x,n));
        // write your code here
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        
        int po = power(x,n-1);
        int tpo = x*po;
        return tpo;
    }

}