import java.io.*;
import java.util.*;

public class floodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ar[][]= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        boolean visited[][]= new boolean[n][m];
        floodfill(ar, 0, 0, "",visited);

    }
    public static void floodfill(int[][] maze, int row, int col, String psf,boolean visited[][]){

        if(row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 || visited[row][col]==true){
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(psf);
            return;
        }
        
        visited[row][col]=true;
        floodfill(maze, row-1, col, psf+"t",visited);
        floodfill(maze, row+1, col, psf+"d",visited);
        floodfill(maze, row, col+1, psf+"r",visited);
        floodfill(maze, row, col-1, psf+"l",visited);
        visited[row][col]=false;
    }
}
