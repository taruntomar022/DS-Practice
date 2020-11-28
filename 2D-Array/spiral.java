import java.io.*;
import java.util.*;

public class spiral {
    public static void insert(int [][]arr,Scanner scn,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }


    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();
    
    
    int arr[][] = new int[row][col];
    insert(arr,scn,row,col);
    
    int rowmin = 0;
    int rowmax = row-1;
    int colmin = 0;
    int colmax = col-1;
    
    int count = 0;
    while(count < row*col){
        
        
    for(int i=rowmin;i<=rowmax && count < row*col;i++){
        System.out.println(arr[i][colmin]);
        count++;
    } 
    colmin++;
    
    for(int i=colmin;i<=colmax && count < row*col;i++){
        System.out.println(arr[rowmax][i]);
    }
    rowmax--;
    
    for(int i=rowmax;i>=rowmin && count < row*col;i--){
        System.out.println(arr[i][colmax]);
    }
    colmax--;
    
    for(int i=colmax;i>=colmin && count < row*col;i--){
        System.out.println(arr[rowmin][i]);
    }
    rowmin++;

    }
}
}