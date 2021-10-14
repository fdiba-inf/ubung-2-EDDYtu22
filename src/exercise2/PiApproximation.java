package exercise2;
import java.lang.Math;

public class PiApproximation {
    public static void main(String[] args) {
        float Pi = (float) (4.0*(1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/11.0-1/13.0+1.0/17.0-1.0/19.0+1.0/23.0));
        int a = (int) (Pi*10000);
        double b = (double) a/10000;

        System.out.println("Pi:" + b);

    }
}

