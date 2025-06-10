//extending interfaces
import java.util.*;
interface basicoperations{
    void add(int a,int b);
}
//derived interface from parent
interface adoperations extends basicoperations{
    void multiply(int a,int b); 
}
class calculator implements adoperations{
    public void add(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
    public void multiply(int a,int b){
        System.out.println("Multiplication: "+(a*b));
    }
}
public class intarop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int y=sc.nextInt();
        //pbject defining and accessing
        calculator c=new calculator();
        c.add(x,y);
        c.multiply(x,y); 
    }
}