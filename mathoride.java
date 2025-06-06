import java.util.*;
class calc{
    int a,b;
    void setvalues(int a,int b){
        this.a=a;
        this.b=b;
    }
    void calculate(){
        int sum=a+b;
        System.out.println("Sum from parent: "+sum);
    }
}
class extraop extends calc{
    @Override
    void calculate(){
        int multi=a*b;
        System.out.println("Product from child: "+multi);
    }
}
public class mathoride{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x= sc.nextInt();
        System.out.print("Enter Second number: ");
        int y= sc.nextInt();
        calc c=new calc();
        c.setvalues(x, y);
        c.calculate();
        extraop e=new extraop();
        e.setvalues(x, y);
        e.calculate();
    }
}