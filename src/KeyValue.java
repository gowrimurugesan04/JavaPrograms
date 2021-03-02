import java.util.Scanner;
import java.util.TreeMap;

public class KeyValue {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i = 3;
        //i=sc.nextInt();
        TreeMap<String, String> map = new TreeMap<>();
        while (i > 0) {
            String a = sc.nextLine();
            String s = sc.nextLine();
            map.put(a, s);
            i--;
        }
        System.out.println(map.lastEntry());
    }
}


