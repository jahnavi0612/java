import java.util.*;
public class palindrome1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
int b=a.length();
a = a.replaceAll("\\s", "").toLowerCase();
int flag=1;
for(int i=0,j=b-1;i<b/2;i++,j--)
{
if(a.charAt(i)!=a.charAt(j)){
flag=0;
break;
}
}
if(flag==1)
{
System.out.println("Is a Palindrome");
}
else
{
System.out.println("Not a palindrome");
}
}
}


