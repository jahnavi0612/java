import java.util.*;
class person{
    protected String name;
    protected void setname(String name){
        this.name=name;
}
protected void displayname(){
    System.out.println("Name: "+name);
}
}
class boy extends person{
    protected float height;
    protected void setheight(float height){
        this.height=height;
    }
    public void displaydetails(){
        displayname();
        System.out.println("height: "+height);
    }
}
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boy b=new boy();
        System.out.println("Enter the name: ");
        String nameinput=sc.nextLine();
        b.setname(nameinput);
        System.out.println("Enter height: ");
        float height=sc.nextFloat();
        b.setheight(height);
        System.out.println("----------person details---------");
        b.displaydetails();
    }
}