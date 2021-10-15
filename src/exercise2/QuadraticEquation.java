package exercise2;


import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c: ");
        System.out.print("a:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("b:");
        int b = input.nextInt();
        System.out.print("c:");
        int c = input.nextInt();
        if (a!=0){
            double D = b*b - 4*a*c;
            if (D>=0){
                System.out.println("zwei Lösungen");
            } else {
                System.out.println("Imaginary values");
            }
        }else {
            if (b!=0){
            System.out.println("eine Lösung");
        } else {
                if (c!=0){
                    System.out.println("keine Lösung");
                }else {
                    System.out.println("unendlich viele Lösungen");
                }
            }

        }



    }
}
