//super factorial
import java.util.*;
class superfactorial
{
    int factorial(int n){
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    long calcfact(int n)
    { 
        long sf=1;
        for(int i=1;i<=n;i++)
        {
            sf*=factorial(i);
        }
        return sf;
    }
}
public class superfact{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        superfactorial obj=new superfactorial();
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        long result=obj.calcfact(num);
        System.out.println("Super factorial of "+num+"is"+result);
        sc.close();
    }
}