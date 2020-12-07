import java.io.*;
import  java.util.*;

public class getMazePath{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePath(1,1,n,m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){

        if(sr==dr && sc==dc){
            ArrayList<String> nL=new ArrayList<>();
            nL.add("");
            return nL;
        }
        ArrayList<String> pathHor = new ArrayList<>();
        ArrayList<String> pathVer = new ArrayList<>();
        if(sc<dc){
            pathHor= getMazePath(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            pathVer= getMazePath(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for(String pH : pathHor){
            paths.add("h"+pH);
        }
        for(String pV : pathVer){
            paths.add("v"+pV);
        }

        return paths;
    }
}