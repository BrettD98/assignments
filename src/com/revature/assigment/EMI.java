package com.revature.assigment;

import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int in = scanner.nextInt();
        System.out.println("Loan: ");
        int loan = scanner.nextInt();
        System.out.println("Interest Rate:");
        float rate = scanner.nextFloat();
        System.out.println("Tenure:");
        int time = scanner.nextInt();

        double answer = (loan - in) * rate * ( Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);

        System.out.println("EMI: " + answer);

    }
}
