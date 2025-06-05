//Write a program to calculate and print the product of all elements in an array. First line (n) is the size (e.g., 3), followed by n lines (e.g., 2, 3, 4).
import java.util.*;
public class arrayproduct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int product=1;
         for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            product=product*arr[i];
        }
        System.out.println(product);
    }
}