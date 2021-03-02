import java.io.*;
import java.util.*;
public class FirstRepeat {
    public static void main(String args[])
    {
        int n,i,j,f=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    f=1;
                }

            }
            if(f==1)
                break;
        }
    }
}
