package practice;
import java.util.*;
public class Fourth {
    public static void main(String args[]){
        Scanner sf=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            a[i]=sf.nextInt();
        }
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            System.out.println(i);
            b[i]=a[j];
            j++;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }
    }
}
