package practice;
import java.util.*;
public class Main1 {
    public static void main(String args[]){
        Scanner sf=new Scanner(System.in);
        System.out.println("pls enter what type of employee salary would you like to see: ");
        String a=sf.nextLine();
        Contract ct=new Contract();
        if(a.equals("fulltime")){
            System.out.println("please enter a full time salary");
            int fix_salary = sf.nextInt();
            System.out.println("please enter a type of performance:");
            String b=sf.next();
            ct.Fixed(fix_salary,b);
        }
        else if(a.equals("parttime")){
            System.out.println("please enter a hourly pay: ");
            int b=sf.nextInt();
            System.out.println("please enter the hrs that a employee worked:");
            int c=sf.nextInt();
            ct.Hourly(b,c);
        }
        else if(a.equals("contract")){
            System.out.println("please enter the contract employee salary:");
            int d=sf.nextInt();
            ct.Fixed(d);
        }
        else{
            System.out.println("please enter a valid ans");
        }
    }
}
