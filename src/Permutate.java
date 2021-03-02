import java.io.*;
import java.util.*;
public class Permutate {
public static void main(String args[])
{
    int s=0,e;
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    e=str.length();
    Permutate permute1=new Permutate();
    permute1.permute(str,s,e-1);

}
public void permute(String str, int st,int end)

{
    if (st == end) {
        System.out.println(str);
    } else {
        for (int i = st; i <= end; i++) {
            swap(str, st, end);
            permute(str, st + 1, end);
            swap(str, st, end);
        }
    }
}
    public String swap(String str,int st,int en)
    {
        char t;
        char[] arr = str.toCharArray();
        t= arr[st] ;
        arr[st] = arr[en];
        arr[en] = t;
        return String.valueOf(arr);
    }
}
