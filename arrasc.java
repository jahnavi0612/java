//Write a program to implement Insertion Sort to sort only the first k elements of an array in ascending order, leaving the rest unchanged.
// Integers n (array size) and k (number of elements to sort), followed by n space-separated integers
import java.util.*;
public class arrasc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[a];
        int i;
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<k;i++)
        {
           int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for(i=0;i<a;i++){
        System.out.printf("%d ",arr[i]);
        }
    }
}