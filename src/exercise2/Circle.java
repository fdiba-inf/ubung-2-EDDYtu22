package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Radius:");
        double radius = input.nextDouble();
        double Pi = Math.PI;
        double Circumference = 2.0*Pi*radius;
        //double area = Pi*radius*radius;
        System.out.println("Circumference: " + Circumference);
        //System.out.println("Area:" + area);


    }
}
