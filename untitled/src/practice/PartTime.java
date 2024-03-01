package practice;
import java.util.*;
public class PartTime extends FullTime{
    public void Hourly(int hr_pay,int hrs){
        Scanner sf=new Scanner(System.in);
        int d;
        if(hrs>40){
            int e=hrs-40;
            System.out.println("pls enter the extra hrs pay: ");
            int f=sf.nextInt();
            d=(hrs*hr_pay)+(e*f);
            System.out.println("The part time employee weekly pay is: "+d);
        }
        else{
            d=hrs*hr_pay;
            System.out.println("the part time employee pay is:"+d);
        }
    }
}
