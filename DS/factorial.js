import java.io.*;
import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code hereScanner sc = 
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(factorial(n));
        
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        
        
        int fcn = factorial(n-1);
        int fn  = n* fcn;
        
        return fn;
    }

}