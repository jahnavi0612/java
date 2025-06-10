//dip
import java.util.*;
// Abstraction interface
interface MathOperation {
    int operate(int a, int b);
}
// 1st low-level module
class Addition implements MathOperation {
    public int operate(int a, int b) {
        return a + b;
    }
}
// 2nd low-level module
class Multiplication implements MathOperation {
    public int operate(int a, int b) {
        return a * b;
    }
}
// High-level module based on abstract interface
class Calculator {
    private MathOperation operation;

    // Constructor
    public Calculator(MathOperation operation) {
        this.operation = operation;
    }

    public void calculate(int a, int b) {
        int result = operation.operate(a, b);
        System.out.println("Result: " + result);
    }
}
// Main class
public class lowmod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation: 1. Add  2. Multiply");
        int choice = sc.nextInt();

        MathOperation operation;

        if (choice == 1) {
            operation = new Addition();
        } else {
            operation = new Multiplication();
        }

        Calculator c = new Calculator(operation);
        c.calculate(num1, num2);
    }
}