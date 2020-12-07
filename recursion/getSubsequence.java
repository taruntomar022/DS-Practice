import java.io.*;
import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> out = gss(str);
        System.out.println(out);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        
        char ch = str.charAt(0);
        String res = str.substring(1);
        
        ArrayList<String> rem = gss(res);
        
        ArrayList<String> mres = new ArrayList<>();
        
        for( String r : rem){
            mres.add(""+r);
            mres.add(ch+r);
        }
        
        return mres;
    }

}