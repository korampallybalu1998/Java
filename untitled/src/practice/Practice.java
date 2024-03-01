package practice;
import java.util.*;
public class Practice {
    int number;
    static int num;
    public static void main(String args[]){
        Practice p1=new Practice();
        p1.number=new Random().nextInt();
        Practice p2=new Practice();
        p2.number=new Random().nextInt();
        System.out.println("p1"+p1.number+"  p2"+p2.number);
        p1.num=new Random().nextInt();
        p2.num=new Random().nextInt();//for p1.num and p2.num its gives the same output because the num is static
        Practice.num=new Random().nextInt();//to call static num we don't need to create the object
        System.out.print(p1.num+"    "+p2.num+"   "+Practice.num);


    }
}
