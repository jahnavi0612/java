//Write a program to sort an array such that all even numbers come before odd numbers, maintaining their relative order within each group.
import java.util.*;
public class evenoddarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.printf("%d ",arr[i]);
            }
        }
        for (int i =0; i<n; i++) {
            if(arr[i]%2!=0)
            {
                System.out.printf("%d ",arr[i]);
            }
        }
    }
}