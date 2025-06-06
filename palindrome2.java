import java.util.*;

public class palindrome2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.nextLine();
	String cleaned=a.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean isPalindrome = true;
	int left=0;
	int right=cleaned.length()-1;
        while(left<right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
	left++;
	right--;
        }
        if (isPalindrome) {
            System.out.println("Is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
