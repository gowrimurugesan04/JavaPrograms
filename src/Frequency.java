import java.io.*;
import java.util.*;
public class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int i, j;
        int fre[] = new int[a.length()];
        char arr[] = a.toCharArray();
        int n = a.length();

        for (i = 0; i < a.length(); i++) {
            fre[i] = 1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    fre[i]++;
                    arr[j] = '-';
                }
            }
        }
        for(i=0;i<fre.length;i++)
            if(arr[i]!='-'&& fre[i]!=1)
            System.out.println(arr[i]+" "+fre[i]);

    }
}
