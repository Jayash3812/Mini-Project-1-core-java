package com.methods;

import java.util.Scanner;

public interface Modulus {
	static void modulus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Modulus is: " + (num1 % num2));
    }
}
