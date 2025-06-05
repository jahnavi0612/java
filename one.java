import java.util.*;
class student{
    String name;
    int marks;
    student(String n,int m){
        name=n;
        marks=m;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}
public class one{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name=sc.nextLine();
        System.out.println("Enter the marks : ");
        int marks=sc.nextInt();
        student s1=new student(name,marks);
        s1.display();
        sc.close();
    }
}