package com.methods;

import java.util.Scanner;

public interface Subtraction {
	static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Subtraction is: " + (num1 - num2));
    }
}
