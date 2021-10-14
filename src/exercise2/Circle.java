package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Radius:");
        int radius = input.nextInt();
        double Pi = 4.0*(1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/11.0-1/13.0+1.0/17.0-1.0/19.0+1.0/23.0);
        double Circumface = 2.0*Pi*radius;
        double area = Pi*radius*radius;
        System.out.println("Circumface:" + Circumface);
        System.out.println("Area:" + area);


    }
}
