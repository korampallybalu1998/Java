package practice;

public class Practice1 {
    public static void main(String  args[]){
        System.out.println("main");
        Practice1 p2=new Practice1();
    }
    {
        System.out.println("non static");//non static block is execute before executing the constructor method
    }
    static{
        System.out.println("Static");//static execute first before executing the main method if we defined the static block
    }
    public Practice1(){
        System.out.println("constructor");
    }

}
