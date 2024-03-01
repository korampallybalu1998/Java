package KBPKinheritanceandaccessmodifiers;
import java.sql.SQLOutput;
import java.util.*;
public class Assignment1 {
    public static void main(String args[]){
       /* Write a Java program that classifies a
        given number as positive, negative, or zero
        and prints the appropriate message.
        */
        Scanner sf=new Scanner(System.in);
        int a=sf.nextInt();
        if(a>0){
            System.out.println("a is positive");
            if(a<50){
                System.out.println("low");
            }
            else if(a>=50 && a<=100){
                System.out.println("high");
            }
            else{
                System.out.println("high");
            }
        }
        else if(a==0){
            System.out.println("a is zero");
        }
        else{
            System.out.println("a is negative");
        }
        if(a<18){
            System.out.println("child");
        }else if(a>=18 && a<=65){
            System.out.println("adult");
        }
        else{
            System.out.println("greater");
        }
        System.out.println("enter any number between 1 to 7 ");
        String c=sf.nextLine();
        switch(c){
            case "monday":
                System.out.println("weekday");
                break;
            case "tuesday":
                System.out.println("weekday");
                break;
            case "wednesday":
                System.out.println("weekday");
                break;
            case "thrusday":
                System.out.println("weekday");
                break;
            case "friday":
                System.out.println("weekday");
                break;
            case "saturday":
                System.out.println("weekend");
                break;
            case "sunday":
                System.out.println("weekend");
                break;
        }

    }
}
