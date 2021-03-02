import java.io.*;
import java.util.*;
public class Hydrogen {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h,c,o,c1=0,c2=0,c3=0;
        c=sc.nextInt();
        h=sc.nextInt();
        o=sc.nextInt();
        while(h-2>=0&&o-1>=0)
        {
            c1++;
            h-=2;
            o-=1;
        }
        while(c-1>=0&&o-2>=0)
        {
            c2++;
            c--;
            o-=2;
        }
        while(c-1>=0&&h-4>=0)
        {
            c3++;
            c--;
            h-=4;
        }
        System.out.println(c1+" "+c2+" "+c3);
    }
}
