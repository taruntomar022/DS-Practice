import java.io.*;
import java.util.*;


public  class getStairPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> paths = getStairPath(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairPath(int n){

        if(n==0){
            ArrayList<String> eL = new ArrayList<>();
            eL.add("");
            return eL;
        }else if(n<0){
            ArrayList<String> nL = new ArrayList<>();
            return nL;
        }
        
        ArrayList<String> paths1 = getStairPath(n-1);
        ArrayList<String> paths2 = getStairPath(n-2);
        ArrayList<String> paths3 = getStairPath(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for(String p1 : paths1){
            paths.add(1+p1);
        }
        for(String p2 : paths2){
            paths.add(2+p2);
        }
        for(String p3 : paths3){
            paths.add(3+p3);
        }
        

        return paths;
    }
}
