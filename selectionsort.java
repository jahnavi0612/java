import java.util.*;
public class selectionsort{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.err.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int j,i;
        for(i=0;i<n;i++)
        {
            int minindex=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minindex])
                minindex=j;
            }
            int temp=arr[i];
            arr[i]=minindex;
            arr[minindex]=temp;
        }
        System.out.print("Array after sorting is: ");
        for(i=0;i<n;i++){
        System.out.printf("%d ",arr[i]);
        }
    }
}