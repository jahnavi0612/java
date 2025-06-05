import java.util.*;

public class anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String a = sc.nextLine();
        System.out.println("Enter the second string:");
        String b = sc.nextLine();
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        if (a.length() == b.length()) {
            char[] c = a.toCharArray();
            char[] d = b.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);

            if (Arrays.equals(c, d)) {
                System.out.println("Is an Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
