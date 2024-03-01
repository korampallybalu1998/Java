import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sf=new Scanner(System.in);
        int a[]=new int[2];
        for(int i=0;i<a.length;i++){
            a[i]=sf.nextInt();
        }
        System.out.print("array value is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}