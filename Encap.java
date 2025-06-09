import java.util.*;
public class Encap
{
    static class Student{
        private String name;
        private int age;
        private Double grade;
        //constructor privately for static class
        public Student(String name,int age,double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public double getGrade(){
            return grade;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setAge(int age){
            if(age>19)
            this.age=age;
        else{
            System.out.println("Student is underage for graduation grade");
        }
    }
    public void setGrade(double grade){
        if(grade<=0 && grade>=100){
            this.grade=grade;
        }
        else{
            System.out.println("Invalid grade");
        }
    }
    public void display(){
        System.out.println("Student details");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name=sc.nextLine();
        System.out.println("Enter the student age: ");
        int age=sc.nextInt();
        System.out.println("Enter the student grade: ");
        double grade=sc.nextDouble();
        Student student=new Student(name,age,grade);
        student.display();
        System.out.println("Updating the students data:");
        System.out.println("Enter the name: ");
        sc.nextLine();
        String newname=sc.nextLine();
        student.setName(newname);
        System.out.println("Enter new age: ");
        int newAge=sc.nextInt();
        student.setAge(newAge);
        System.out.println("Enter new grade: ");
        double newgrade=sc.nextDouble();
        student.setGrade(newgrade);
        student.display();
    }
}

