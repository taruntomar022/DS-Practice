import java.io.*;
import java.util.*;

public class Main {

	public static void permutationOfString(String str){
		// write your code here
		int len = str.length();
		int tot=fact(len);
		
		for(int i=0;i<tot;i++){
		    int div = i;
		    StringBuilder  sb = new StringBuilder(str);
		    for(int j = len;j>=1;j--){
		        int rem = div%j;
		        int que = div/j;
		        
		        
		        System.out.print(sb.charAt(rem));
		        sb.deleteCharAt(rem);
		        
		        div = que;
		    }
		    System.out.println();
		}
		
	}
	public static int fact(int len){
	    
	    int multi=1;
	    for(int i=1;i<=len;i++){
	        multi *= i;
	    }
	    
	    return multi;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}