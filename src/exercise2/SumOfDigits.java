package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        int a = (int)number%10;
        int b = (int)number/10;
        int c= (int)b%10;
        int d = (int)number/100;
        int sum = (int)a+c+d;


        System.out.println("Sum of digits: " + sum);
        //System.out.println(b);
    }
}
