import java.util.*;
public class user
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the username:");
String name=sc.nextLine();
System.out.println("Enter the password:");
String password=sc.nextLine();
if(name.equals("janu"))
{
if(password.equals("0612"))
{
System.out.println("Login Successfull");
}
else
{
System.out.println("Invalid Password");
}
}
else
{
System.out.println("Invalid username");
}
}
}
