package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        int a = (int)number%2;
        if (a>=1) {
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }


    }
}
