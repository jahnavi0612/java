import java.util.*;
class mathop{
    protected int number;
    protected void setnumber(int num){
        number=num;
    } 
    protected int square(){
        return number*number;
    }
    protected int cube(){
        return number*number*number;
    }
}
class result extends mathop{
    public void calc(){
        System.out.println("Square: "+square());
        System.out.println("cube: "+cube());
    }
}
public class promath{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        result obj=new result();
        System.out.println("Enter the number");
        int input=sc.nextInt();
        obj.setnumber(input);
        obj.calc();
    }
}