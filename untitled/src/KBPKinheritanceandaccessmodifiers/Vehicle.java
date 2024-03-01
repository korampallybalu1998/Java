package KBPKinheritanceandaccessmodifiers;
import java.util.*;
public class Vehicle {
    String brand;
    String model;
    public Vehicle(){
        Scanner sf=new Scanner(System.in);
        System.out.println("please enter the brand name");
        brand=sf.nextLine();
        System.out.println("please enter the model name");
        model=sf.nextLine();
    }

    public void displayInfo(){
        System.out.println("brand of the vehicle- "+brand);
        System.out.println("model of the vehicle- "+model);
    }
}
