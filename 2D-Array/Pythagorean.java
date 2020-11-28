import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int tmp=0,b=0,h=0;
    
    if(a>b && a>c){
        tmp =a;
        h=b;
        b=c;
    }
    else if(b>c && b>a){
        tmp = b;
        b=a;
        h=c;
    }else{
        tmp=c;
        b=a;
        h=b;
    }
    int sqRt= (int)Math.sqrt(tmp);
    if(sqRt==(h+b)){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
   }
  }