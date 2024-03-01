package practice;

public class Student {
    public static void main(String args[]){
        Student b=new Student();
        Student a=new Student("xgy");

    }
    public Student(){
        System.out.println("unknown");
    }
    public Student(String s){
        String e=s;
        System.out.println(e);
    }
}
