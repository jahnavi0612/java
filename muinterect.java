//declare multiple interface
import java.util.*;
interface area{
    double carea();
}
interface perimeter{
    double cperimeter();
}
//implement interface area and perimeter in class called rectangle
class rectangle implements area,perimeter{
    double length;
    double breadth;
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double carea(){
        return length*breadth;
    }
    public double cperimeter(){
        return (2*(length+breadth));
    }
}
public class muinterect{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length=sc.nextDouble();
        System.out.println("enter the breadth: ");
        double breadth=sc.nextDouble();
        rectangle r=new rectangle(length,breadth);
        System.out.println("Area: "+r.carea());
        System.out.println("Perimeter: "+r.cperimeter());
    }
}