//compile time method using overloading
class MathOperations{
    //overload method 
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Math{
    public static void main(String args[]){
        MathOperations mo=new MathOperations();
        System.out.println("Addition : "+mo.add(2,4));
        System.out.println("Addition: "+mo.add(2.3,4.5));
        System.out.println("Addition: "+mo.add(3,4,5));
    }
}