package exercise2;


import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        //System.out.println("Enter a,b,c: ");
        //System.out.print("a:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        //System.out.print("b:");
        double b = input.nextDouble();
        //System.out.print("c:");
        double c = input.nextDouble();
        double D = b*b - 4*a*c;
        if (D>0){
            double x1 = (-b + Math.sqrt(D))/2.0*a;
            double x2 = (-b - Math.sqrt(D))/2.0*a;
            System.out.println(x1);
            System.out.println(x2);
        } else if (D==0){
            double x3 = (-b/2.0*a);
            System.out.println(x3);
        } else {
            System.out.println("Imaginary values");
        }
    }
}













        /*if (a!=0){
            double D = b*b - 4*a*c;
            if (D>=0){
                double x1 = (-b + Math.sqrt(D))/2*a;
                double x2 = (-b - Math.sqrt(D))/2*a;
                System.out.println(x1);
                System.out.println(x2);
            } else {
                System.out.println("Imaginary values");
            }
        }else {
            if (b!=0){
            double x3 = (-b/2*a);
                System.out.println(x3);
        } else {
                if (c!=0){
                    System.out.println("no way");
                }else {
                    System.out.println("many ways");
                }
            }

        }



    }
}*/
