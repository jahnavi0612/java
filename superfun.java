import java.util.*;
//superclass
class person{
    String name;
    void setname(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name from person superclass : "+name);
    }
}
//class
class student extends person{
    int rollno;
    //super.(destination(attr))
    void setdetails(String name,int rollno){
        super.setname(name);
        //calling superclass method
        this.rollno=rollno;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Roll number from student class : "+rollno);
    }
}
public class superfun{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter student name: ");
       String name=sc.nextLine();
       System.out.println("Enter roll number: ");
       int rollno=sc.nextInt();
       student s=new student();
       s.setdetails(name, rollno);
       s.display();
    }
}