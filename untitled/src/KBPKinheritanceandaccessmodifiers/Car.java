package KBPKinheritanceandaccessmodifiers;
import java.util.*;
public class Car extends Vehicle{
    int numDoors;

    public Car(){
        System.out.println("please enter no of doors");
        Scanner sf=new Scanner(System.in);
        numDoors=sf.nextInt();
        System.out.println("no of doors- "+numDoors);
    }
}
