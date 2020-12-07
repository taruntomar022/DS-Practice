import java.io.*;
import java.util.*;

public class mazePathWithJump {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m= sc.nextInt();

       ArrayList<String> paths = getMazePath(1,1,n,m);
       System.out.println(paths);
   } 
   public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){

    if(sr==dr && sc == dc){
        ArrayList<String> np = new ArrayList<>();
        np.add("");
        return np;
    }

    ArrayList<String> paths = new ArrayList<>();
    for(int ms = 1;ms<= dc-sc;ms++){
        ArrayList<String> hpaths = getMazePath(sr, sc+ms, dr, dc);
        for(String hp:hpaths){
            paths.add("h"+ms+hp);
        }
    }

    for(int ms = 1;ms<= dr-sr;ms++){
        ArrayList<String> vpaths = getMazePath(sr+ms, sc, dr, dc);
        for(String vp:vpaths){
            paths.add("v"+ms+vp);
        }
    }
    for(int ms = 1;ms<= dc-sc && ms<=dr-sr;ms++){
        ArrayList<String> dpaths = getMazePath(sr+ms, sc+ms, dr, dc);
        for(String dp:dpaths){
            paths.add("d"+ms+dp);
        }
    }

    return paths;
   }
}
