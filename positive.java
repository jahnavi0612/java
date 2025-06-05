import java.util.*;
public class positive
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a>0)
System.out.printf("%d is Positive",a);
else if(a==0)
System.out.printf("Zero",a);
else
System.out.printf("%d is Negative",a);
}
}