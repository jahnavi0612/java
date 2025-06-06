import java.util.*;
public class avg
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int avg=0;
      for(i=0;i<n;i++)
        {
          avg=avg+arr[i];
        }
      int b=avg/n;
      for(i=0;i<n;i++)
        {
          if(arr[i]>=b)
          {
            System.out.println(arr[i]);
          }
        }
    }
  }