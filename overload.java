import java.util.*;
class student{
    String name;
    int roll;
    String grade;

    student(){
        name="unknown";
        roll=0;
        grade="Not assigned";
    }
    student(String name,int roll){
        this.name=name;
        this.roll=roll;
        grade="Not assigned";
    }
     student(String name,int roll,String grade){
        this.name=name;
        this.roll=roll;
        this.grade=grade;
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("Roll: "+roll);
    System.out.println("Grade: "+grade);
}
}
public class overload{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       student s1=new student();
       s1.display();
       System.out.println("Enter name: ");
       String name=sc.nextLine();
       System.out.println("Enter rollno: ");
       int roll=sc.nextInt();
       System.out.println("Enter grade: ");
       String grade=sc.nextLine();

       student s2=new student(name,roll);
       s2.display();
       System.out.println("Enter name2: ");
       String name2=sc.nextLine();
       System.out.println("Enter rollno2: ");
       int roll2=sc.nextInt();
       System.out.println("Enter grade2: ");
       String grade2=sc.nextLine();

       student s3=new student(name,roll,grade);
       s3.display();
       System.out.println("Enter name3: ");
       String name3=sc.nextLine();
       System.out.println("Enter rollno3: ");
       int roll3=sc.nextInt();
       System.out.println("Enter grade3: ");
       String grade3=sc.nextLine();
       }
    }
