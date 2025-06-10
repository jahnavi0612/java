//loose coupling
import java.util.*;
//using abstraction interface
interface Printer{
    void print(String content);
}
//a create class for implementation
class LaserPrinter implements Printer{

    LaserPrinter() {
    }
    @Override
    public void print(String content){
        System.out.println("Laser Printer Output "+content);
    }
}
class inkjetPrinter implements Printer{
    @Override
    public void print(String content){
        System.out.println("Inkjet printer Output "+content);
    }
}
//manager class using interface(abstraction)
class PrintManager{
    Printer printer;
    public PrintManager(Printer printer){
        this.printer=printer;
    }
    public void printDocument(String content){
        printer.print(content);
    }
} 
public class loocoup
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a document: ");
        String doc=sc.nextLine();
        System.out.println("Choose printer(1. Laser ,2. inkjet)");
        int choice=sc.nextInt();
        @SuppressWarnings("unused")
        Printer printer;
        if(choice==1){
            printer=new LaserPrinter();
        }
        else{
            printer=new inkjetPrinter();
        }
        printer.print(doc);
    }
}