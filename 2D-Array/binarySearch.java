import java.io.*;
import java.util.*;

public class binarySearch {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int a[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        int ele = sc.nextInt();
        search(a,ele);
    }
    
    public static void search(int ar[][],int ele){
        int i=0;
        int j=ar[0].length-1;
        
        while(i<ar.length && j>=0){
            if(ele == ar[i][j]){
                System.out.println(i);
                System.out.println(j);
                // break;
                return;
            }else if(ele < ar[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");
    }

}