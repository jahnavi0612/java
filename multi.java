import java.util.*;

interface father {
    void getfatherdetails(Scanner sc);
    void showfatherDetails();
}

interface mother {
    void getmotherdetails(Scanner sc);
    void showmotherDetails();
}

class child implements father, mother {
    String fathername, mothername, childname;
    int fatherage, motherage, childage;
    String fatherjob, motherjob, childhobby;

    public void getfatherdetails(Scanner sc) {
        System.out.println("Enter father's name: ");
        fathername = sc.nextLine();
        System.out.println("Enter father's age: ");
        fatherage = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.println("Enter father's job: ");
        fatherjob = sc.nextLine();
    }

    public void showfatherDetails() {
        System.out.println("Father: " + fathername + " | Age: " + fatherage + " | Job: " + fatherjob);
    }

    public void getmotherdetails(Scanner sc) {
        System.out.println("Enter mother's name: ");
        mothername = sc.nextLine();
        System.out.println("Enter mother's age: ");
        motherage = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.println("Enter mother's job: ");
        motherjob = sc.nextLine();
    }

    public void showmotherDetails() {
        System.out.println("Mother: " + mothername + " | Age: " + motherage + " | Job: " + motherjob);
    }

    public void getchilddetails(Scanner sc) {
        System.out.println("Enter child's name: ");
        childname = sc.nextLine();
        System.out.println("Enter child's age: ");
        childage = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.println("Enter child's hobby: ");
        childhobby = sc.nextLine();
    }

    public void showchildDetails() {
        System.out.println("Child: " + childname + " | Age: " + childage + " | Hobby: " + childhobby);
    }
}

public class multi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        child c = new child();

        System.out.println("-----Enter Father's details-----");
        c.getfatherdetails(sc);
        System.out.println("-----Enter Mother's details-----");
        c.getmotherdetails(sc);
        System.out.println("-----Enter Child's details-----");
        c.getchilddetails(sc);

        System.out.println("-----Family Details-----");
        c.showfatherDetails();
        c.showmotherDetails();
        c.showchildDetails();

        sc.close();
    }
}