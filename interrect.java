import java.util.*;
interface shape{
    double area();
    double perimeter();
}
//implement interface shape in a class called rectangle
class rectangle implements shape{
    double length;
    double width;
    rectangle(double l,double w){
        length=l;
        width=w;
    }
    //implementation of math
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}
public class interrect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length=sc.nextDouble();
        System.out.println("Enter the width: ");
        double width=sc.nextDouble();
        //creating an object which calls the method and pass args
        shape r=new rectangle(length,width);
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
    }
}
