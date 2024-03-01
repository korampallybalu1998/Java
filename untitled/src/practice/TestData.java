package practice;
import java.util.*;
public class TestData {
    public static void main(String args[]){
        int a=3;
        int b=6;
        int c=0;
        Smallest(a,b,c);
    }
   /* public static void Ans(int a,int b,int c){
        Scanner sf=new Scanner(System.in);
        a=sf.nextInt();
        b=sf.nextInt();
        c=sf.nextInt();
        Smallest(a,b,c);
    }*/
    public static void Smallest(int a,int b,int c){
        if(a<b && a<c){
            System.out.println(a+" is the smallest number");
        }
        else if(b<a && b<c){
            System.out.println(b+" is a smallest number");
        }
        else if(c<a && c<b){
            System.out.println(c+" is a smallest number");
        }
        else{
            System.out.println("all the values are equal");
        }
    }
}
