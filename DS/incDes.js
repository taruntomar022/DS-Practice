import java.io.*;
import java.util.*;

public class incDes {

    public static void main(String[] args) throws Exception {
        // write your code hereScnna
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
        
    }

}