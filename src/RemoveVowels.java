import java.io.*;
import java.util.*;
public class RemoveVowels {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ar=sc.nextLine();
        int i,n;
        n=ar.length();
        char arr[]=ar.toCharArray();
        for(i=0;i<n;i++)
        {
            if(arr[i]!='A'&& arr[i]!='E'&& arr[i]!='I' && arr[i]!='O'&& arr[i]!='U'&& arr[i]!='a'&& arr[i]!='e'&& arr[i]!='i'&&
                    arr[i]!='o'&& arr[i]!='u')
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

}
