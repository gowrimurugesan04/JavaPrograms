import java.io.*;
import java.util.*;
import java.lang.*;
public class Lapindrome {
    public static void main(String args[])
    {
        int len,chars,t=0,i;
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2,str3;
        len=str1.length();
       String part;
        char arr[]=new char [100];
        char arr1[]=new char [100];
        if(len%2==0)
        {
            str2=str1.substring(0,len/2);
            str3=str1.substring(len/2,len);
        }
        else
        {
            str2=str1.substring(0,len/2);
            str3=str1.substring(len/2+1,len);
        }
System.out.println(str2);
        System.out.println(str3);
        arr=str2.toCharArray();
        arr1=str3.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
