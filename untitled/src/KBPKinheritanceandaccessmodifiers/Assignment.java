package KBPKinheritanceandaccessmodifiers;
import java.util.*;
public class Assignment {
    public static void main(String args[]){
        /*Write a Java program that checks if
        a given number is positive and prints "Number is positive" if true.*/
        Scanner af=new Scanner(System.in);
        System.out.println("please enter a A value");
        int a=af.nextInt();
        if(a>0){
            System.out.println("Number is positive");
        }
        System.out.println("my work is done for question 1");
        /*Create a Java program that verifies if a user's age is
         greater than 18 and prints "You are an adult" if true.
         */
        System.out.println("please enter a age");
        int b=af.nextInt();
        if(b>18){
            System.out.println("you are adult");
        }
        /*Develop a Java program that checks if a user's input string is
        empty and prints "String is empty" if true.
         */
        System.out.println("please enter any string value");
        String c=af.nextLine();
        if(true){
            System.out.println("String is empty");
        }
        /*Write a Java program that checks if a given number is even and prints
        "Number is even" if true, otherwise prints "Number is odd".*/
        if(a%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        /* Create a Java program that verifies if a user's entered password is "password"
        and prints "Access granted" if true, otherwise prints "Access denied".*/
        System.out.println("enter a string value");
        String d=af.nextLine();
        if(d.equals("Password")){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }
        /*Develop a Java program that categorizes a user's input as "child" if age is less than 18,
        "adult" if between 18 and 65, and "senior" if greater than 65.*/
        System.out.println("please enter a year");
        int e=af.nextInt();
        if(e%4==0){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not leap year");
        }
    }
}
