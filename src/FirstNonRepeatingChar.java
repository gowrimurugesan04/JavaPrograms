import java.io.*;
import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String args[])
    {
        int n,i,j,count;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]= new char[s.length()];
      arr=s.toCharArray();
      n=s.length();
      for(i=0;i<n;i++)
      {
         count=0;
         for(j=i+1;j<n;j++)
         {
             if(arr[i]==arr[j])
                 count++;
         }
         if(count == 0 ) {
             System.out.println(" " + arr[i]);
             break;
         }
//         else
//             arr[i]='0';
      }



    }
}
