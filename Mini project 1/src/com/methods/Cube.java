package com.methods;

import java.util.Scanner;

public interface Cube {
	static void cube() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        double num = scanner.nextDouble();
	        System.out.println("Cube is: " + (num * num * num));
	}
}
