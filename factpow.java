import java.util.*;
class inputnumbers{
    int a,b;
    void getinput(Scanner sc){
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
    }
}
class powercal extends inputnumbers{
    void power(){
        int result=1;
        for(int i=1;i<=b;i++){
            result *=a;
        }
        System.out.println("Power ("+a+"^"+b+"):"+result);
    }
}
class factorialcal extends powercal{
    int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        fact*=i;
        return fact;
    }
    void showfactorial(){
        System.out.println("Factorial of "+a+":"+factorial(a));
        System.out.println("Factorial of "+b+":"+factorial(b));
    }
}
public class factpow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        factorialcal obj=new factorialcal();
        obj.getinput(sc);
        System.out.println();
        obj.power();
        obj.showfactorial();
        sc.close();
    }
}