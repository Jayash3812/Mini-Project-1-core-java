package com.methods;

import java.util.Scanner;

public interface Addition {
	static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Addition is: " + (num1 + num2));
    }
}
