package practice;
import java.util.*;
public class Second {
    public static void main(String args[]){
        Scanner sf=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sf.nextInt();
        }
        System.out.println("pls enter a number");
        int b=sf.nextInt();
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                c=1;
                System.out.println("we found the number");
            }
        }
        if(c==0){
            System.out.println("we didn,t found the number");
        }
    }

}
