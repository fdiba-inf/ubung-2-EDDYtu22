package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Radius:");
        double radius = input.nextDouble();
        double Pi = 3.14;
        double Circumface = 2.0*Pi*radius;
        double area = Pi*radius*radius;
        System.out.println("Circumference: " + Circumface);
        //System.out.println("Area:" + area);


    }
}
