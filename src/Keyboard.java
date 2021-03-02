import java.io.*;
import java.util.*;
public class Keyboard {
    public static void main(String args[])
    {
        int i,j,in1=1000,in2=0,n,sh=0,lo=0;
        String str;
        Scanner sc=new Scanner(System.in);
        String arr[]=new String [11];
        int ar[]=new int[11];
        for(i=0;i<10;i++)
        {
            str =sc.nextLine();
            n=str.length();
            if(in1>n)
            {
                in1=n;
                sh=i;

            }
            if(in2<n)
            {
                in2=n;
                lo=i;
            }
            arr[i]=str;
        }
        //Arrays.sort(ar);


        if(sh< lo)
        System.out.println(arr[sh]+"");
        else
            System.out.println(""+arr[lo]);
    }
}
