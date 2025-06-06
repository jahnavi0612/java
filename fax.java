import java.util.*;
class cal{
    int a,c;
    double b;
    void setvalues(int a,double b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void fact(){
        int i,fact=1;
        for(i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial : "+fact);
    }
}
class expo extends cal{
    @Override
    void fact(){
        b=Math.pow(c,b);
        System.out.println("Power: "+b);
    }
}
public class fax{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x= sc.nextInt();
        System.out.print("Enter second number: ");
        double y= sc.nextDouble();
        System.out.print("Enter third number: ");
        int z= sc.nextInt();
        cal f=new cal();
        f.setvalues(x,y,z);
        f.fact();
        expo e = new expo();
        e.setvalues(x, y, z);
        e.fact();
    }
}