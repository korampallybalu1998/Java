package practice;

public class Rectangle {
    int length;
    int width;
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.length=23;
        r.width=20;
        r.Area(r.length,r.width);
    }
    public void Area(int length,int width){
        int area=length*width;
        int perimeter=2*(length+width);
        System.out.println("area of rectangle "+area);
        System.out.println("perimeter of rectangle "+perimeter);
    }
}

