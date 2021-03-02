import java.io.*;
import java.util.*;
public class Box {

        double len, wid, hei;


    public Box(double length, double width, double height) {
           len=length;
           hei=height;
           wid=width;
    }

    public void area()
        {
            double ar=len*wid*hei;
            System.out.println("Area is "+ar);
        }
        public void volume()
        {
            double vol=(len*hei)+(hei*wid);
            double vol1=2*vol;
            System.out.println("Volume is "+vol1);
        }


}
