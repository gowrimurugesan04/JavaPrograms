import java.io.*;
import java.util.*;
public class AllPair {
public static void main(String args[])
{
    int i,j,n,key,sum=0,s=0;
    int arr[]=new int[100];
    int ar1[]=new int[100];
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    key=sc.nextInt();
    System.out.println("Pair of elements whose sum is equal to "+key);
    for(i=0;i<n;i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if(arr[i]+arr[j]==key)
            {
                System.out.print(arr[i]+" "+arr[j]+" ");
                arr[i]=0;
                arr[j]=0;
            }
        }
    }
}
}
