import java.util.Scanner;
public class sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=0;
for(int j=1;j<=a;j++)
{
i=i+j;
}
System.out.println(i);
}
}