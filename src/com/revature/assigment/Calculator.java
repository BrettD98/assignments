package com.revature.assigment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        boolean j = true;

        while(j){
            System.out.print("Enter First Number: ");
            a = scan.nextInt();
            System.out.print("Enter Second Number: ");
            b = scan.nextInt();

            System.out.println("""
                    Select Option:
                    1) Add
                    2) Subtract
                    3) Multiply
                    4) Divide
                    5) Exit""");


            int z = scan.nextInt();
            System.out.print("Result: ");
            switch (z) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("Cannot Divide by 0");
                    }
                    break;
                case 5:
                    j = false;
                    break;
                default:
                    System.out.println("Input not accepted");
            }
        }
    }
}
