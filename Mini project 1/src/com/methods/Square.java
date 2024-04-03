package com.methods;

import java.util.Scanner;

public interface Square {
	static void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = scanner.nextDouble();
        System.out.println("Square is: " + (num * num));
    }
}
