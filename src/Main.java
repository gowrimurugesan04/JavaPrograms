import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            double len, wid, hei;
            len = sc.nextDouble();
            wid = sc.nextDouble();
            hei = sc.nextDouble();
            Box b;
            b = new Box(len,wid,hei);
            b.area();
            b.volume();
        }
        catch(Exception e)
        {

        }

    }
}
