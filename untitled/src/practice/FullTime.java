package practice;
import java.util.*;
public class FullTime {
    public void Fixed(int a,String b){
        System.out.println("Fixed salary: "+a);
        int d;
        int c;
        Scanner sf=new Scanner(System.in);
        if(b.equals("excellent")){
            System.out.println("the employee performance is excellent so how much is the bonus: ");
            c=sf.nextInt();
            d=a+c;
            System.out.println("performance is excellent so the total salary:"+d);
        }
        else if(b.equals("good")){
            System.out.println("the employee performance is good so how much is the bonus: ");
            c=sf.nextInt();
            d=a+c;
            System.out.println("performance is good so the total salary is: "+d);
        }
        else{
            System.out.println("Based on the employee performance the bonus is: ");
            c=sf.nextInt();
            d=a+c;
            System.out.println("Based on the employee performance the salary is: "+c);
        }
    }
}
